import javax.sound.sampled.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LanguageVisitorExt extends LanguageBaseVisitor<Void> {
    private final Map<String, Note> notes = new HashMap<>();
    private final Map<String, List<String>> sequences = new HashMap<>();

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
        String tone = ctx.tono().getText();
        float duration = Float.parseFloat(ctx.duracion().getText().replace("s", ""));
        int octave = Integer.parseInt(ctx.octava().getText().replace("o", ""));

        notes.put(id, new Note(tone, duration, octave));
        System.out.println("Nota añadida: " + id);
        return null;
    }

    @Override
    public Void visitDeclaracion_de_pausa(LanguageParser.Declaracion_de_pausaContext ctx) {
        String id = ctx.ID().getText();
        float duration = Float.parseFloat(ctx.duracion().getText().replace("s", ""));

        // Añadir pausa como una nota silenciosa (frecuencia 0)
        notes.put(id, new Note("C", duration, 0));
        System.out.println("Pausa añadida: " + id);
        return null;
    }

    @Override
    public Void visitDeclaracion_de_secuencia(LanguageParser.Declaracion_de_secuenciaContext ctx) {
        String id = ctx.ID().getText();
        List<String> elements = new ArrayList<>();
        for (LanguageParser.Elemento_secuenciaContext elem : ctx.elemento_secuencia()) {
            elements.add(elem.ID().getText());
        }
        sequences.put(id, elements);
        System.out.println("Secuencia añadida: " + id);
        return null;
    }

    @Override
    public Void visitDeclaracion_de_reproduccion(LanguageParser.Declaracion_de_reproduccionContext ctx) {
        String id = ctx.ID().getText();
        if (notes.containsKey(id)) {
            Note note = notes.get(id);
            playTone(note.getFrequency(), note.getDuration());
            System.out.println("Reproduciendo nota: " + id);
        } else if (sequences.containsKey(id)) {
            List<String> sequence = sequences.get(id);
            for (String noteId : sequence) {
                Note note = notes.get(noteId);
                if (note != null) {
                    playTone(note.getFrequency(), note.getDuration());
                    System.out.println("Reproduciendo nota: " + noteId);
                } else {
                    System.err.println("Nota no encontrada en secuencia: " + noteId);
                }
            }
        } else {
            System.err.println("Nota o secuencia no encontrada: " + id);
        }
        return null;
    }

    @Override
    public Void visitDeclaracion_de_bucle(LanguageParser.Declaracion_de_bucleContext ctx) {
        int repetitions = Integer.parseInt(ctx.NUMERO().getText());
        for (int i = 0; i < repetitions; i++) {
            visit(ctx.bloque());
        }
        System.out.println("Bucle ejecutado " + repetitions + " veces.");
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

    private void playTone(double frequency, float duration) {
        try {
            float sampleRate = 44100;
            int bufferSize = (int) (sampleRate * duration);
            byte[] buf = new byte[bufferSize];
            for (int i = 0; i < buf.length; i++) {
                double angle = 2.0 * Math.PI * i / (sampleRate / frequency);
                buf[i] = (byte) (Math.sin(angle) * 127);
            }

            AudioFormat af = new AudioFormat(sampleRate, 8, 1, true, true);
            SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
            sdl.open(af);
            sdl.start();
            sdl.write(buf, 0, buf.length);
            sdl.drain();
            sdl.close();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private class Note {
        private final String tone;
        private final float duration;
        private final int octave;

        public Note(String tone, float duration, int octave) {
            this.tone = tone;
            this.duration = duration;
            this.octave = octave;
        }

        public double getFrequency() {
            int noteIndex = "CDEFGAB".indexOf(tone.charAt(0));
            return 440.0 * Math.pow(2, (noteIndex - 9 + (octave - 4) * 12) / 12.0);
        }

        public float getDuration() {
            return duration;
        }
    }
}
