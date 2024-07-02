import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LanguageVisitor extends AbstractParseTreeVisitor<Void> implements LanguageBaseVisitor<Void> {

    private final Map<String, Nota> notas = new HashMap<>();
    private final Map<String, Pausa> pausas = new HashMap<>();
    private final Map<String, List<SecuenciaElemento>> secuencias = new HashMap<>();

    @Override
    public Void visitPrograma(LanguageParser.ProgramaContext ctx) {
        System.out.println("Iniciando el programa...");
        return visitChildren(ctx);
    }

    @Override
    public Void visitBloque(LanguageParser.BloqueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Void visitDeclaracion(LanguageParser.DeclaracionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Void visitDeclaracion_de_nota(LanguageParser.Declaracion_de_notaContext ctx) {
        String id = ctx.ID().getText();
        String tono = ctx.tono().getText();
        String duracion = ctx.duracion().getText();
        String octava = ctx.octava().getText();

        Nota nota = new Nota(tono, duracion, octava);
        notas.put(id, nota);

        System.out.println("Nota declarada: " + id + " = " + nota);
        return null;
    }

    @Override
    public Void visitDeclaracion_de_pausa(LanguageParser.Declaracion_de_pausaContext ctx) {
        String id = ctx.ID().getText();
        String duracion = ctx.duracion().getText();

        Pausa pausa = new Pausa(duracion);
        pausas.put(id, pausa);

        System.out.println("Pausa declarada: " + id + " = " + pausa);
        return null;
    }

    @Override
    public Void visitDeclaracion_de_secuencia(LanguageParser.Declaracion_de_secuenciaContext ctx) {
        String id = ctx.ID().getText();
        List<SecuenciaElemento> elementos = ctx.elemento_secuencia().stream()
                .map(elemento -> {
                    if (elemento.ID() != null) {
                        String elementoId = elemento.ID().getText();
                        if (notas.containsKey(elementoId)) {
                            return new SecuenciaElemento(notas.get(elementoId));
                        } else if (pausas.containsKey(elementoId)) {
                            return new SecuenciaElemento(pausas.get(elementoId));
                        } else {
                            throw new RuntimeException("Elemento no declarado: " + elementoId);
                        }
                    } else {
                        throw new RuntimeException("Elemento no válido en secuencia");
                    }
                })
                .toList();

        secuencias.put(id, elementos);

        System.out.println("Secuencia declarada: " + id + " = " + elementos);
        return null;
    }

    @Override
    public Void visitDeclaracion_de_reproduccion(LanguageParser.Declaracion_de_reproduccionContext ctx) {
        String id = ctx.ID().getText();

        if (notas.containsKey(id)) {
            System.out.println("Reproduciendo nota: " + notas.get(id));
        } else if (pausas.containsKey(id)) {
            System.out.println("Reproduciendo pausa: " + pausas.get(id));
        } else if (secuencias.containsKey(id)) {
            System.out.println("Reproduciendo secuencia: " + id);
            secuencias.get(id).forEach(elemento -> {
                if (elemento.isNota()) {
                    System.out.println("Reproduciendo nota: " + elemento.getNota());
                } else if (elemento.isPausa()) {
                    System.out.println("Reproduciendo pausa: " + elemento.getPausa());
                }
            });
        } else {
            throw new RuntimeException("Elemento no declarado: " + id);
        }

        return null;
    }

    @Override
    public Void visitDeclaracion_de_bucle(LanguageParser.Declaracion_de_bucleContext ctx) {
        int iteraciones = Integer.parseInt(ctx.NUMERO().getText());
        System.out.println("Iniciando bucle con " + iteraciones + " iteraciones");

        for (int i = 0; i < iteraciones; i++) {
            visitChildren(ctx.bloque());
        }

        System.out.println("Finalizando bucle");
        return null;
    }

    @Override
    public Void visitTono(LanguageParser.TonoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Void visitDuracion(LanguageParser.DuracionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Void visitOctava(LanguageParser.OctavaContext ctx) {
        return visitChildren(ctx);
    }

    private static class Nota {
        private final String tono;
        private final String duracion;
        private final String octava;

        public Nota(String tono, String duracion, String octava) {
            this.tono = tono;
            this.duracion = duracion;
            this.octava = octava;
        }

        @Override
        public String toString() {
            return "Nota{" +
                    "tono='" + tono + '\'' +
                    ", duracion='" + duracion + '\'' +
                    ", octava='" + octava + '\'' +
                    '}';
        }
    }

    private static class Pausa {
        private final String duracion;

        public Pausa(String duracion) {
            this.duracion = duracion;
        }

        @Override
        public String toString() {
            return "Pausa{" +
                    "duracion='" + duracion + '\'' +
                    '}';
        }
    }

    private static class SecuenciaElemento {
        private final Nota nota;
        private final Pausa pausa;

        public SecuenciaElemento(Nota nota) {
            this.nota = nota;
            this.pausa = null;
        }

        public SecuenciaElemento(Pausa pausa) {
            this.nota = null;
            this.pausa = pausa;
        }

        public boolean isNota() {
            return nota != null;
        }

        public boolean isPausa() {
            return pausa != null;
        }

        public Nota getNota() {
            return nota;
        }

        public Pausa getPausa() {
            return pausa;
        }

        @Override
        public String toString() {
            if (isNota()) {
                return nota.toString();
            } else if (isPausa()) {
                return pausa.toString();
            } else {
                return "Elemento no válido";
            }
        }
    }
}
