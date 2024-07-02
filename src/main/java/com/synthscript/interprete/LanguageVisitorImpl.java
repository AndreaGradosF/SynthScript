
package com.synthscript.interprete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LanguageVisitorImpl extends LanguageBaseVisitor<Object> {

    private final Map<String, Object> symbolTable = new HashMap<>();

    @Override
    public Object visitDeclaracion_de_nota(LanguageParser.Declaracion_de_notaContext ctx) {
        String id = ctx.ID().getText();
        String tono = ctx.tono().getText();
        String duracion = ctx.duracion().getText();
        int octava = Integer.parseInt(ctx.octava().getText());

        Note note = new Note(tono, duracion, octava);
        symbolTable.put(id, note);

        return null;
    }

    @Override
    public Object visitDeclaracion_de_pausa(LanguageParser.Declaracion_de_pausaContext ctx) {
        String id = ctx.ID().getText();
        String duracion = ctx.duracion().getText();

        Pause pause = new Pause(duracion);
        symbolTable.put(id, pause);

        return null;
    }

    @Override
    public Object visitDeclaracion_de_secuencia(LanguageParser.Declaracion_de_secuenciaContext ctx) {
        String id = ctx.ID().getText();
        List<LanguageParser.Elemento_secuenciaContext> elementos = ctx.elemento_secuencia();

        Sequence sequence = new Sequence();
        for (LanguageParser.Elemento_secuenciaContext elemento : elementos) {
            String elementId = elemento.ID().getText();
            sequence.addElement(symbolTable.get(elementId));
        }
        symbolTable.put(id, sequence);

        return null;
    }

    @Override
    public Object visitDeclaracion_de_reproduccion(LanguageParser.Declaracion_de_reproduccionContext ctx) {
        String id = ctx.ID().getText();
        Object item = symbolTable.get(id);

        if (item instanceof Note) {
            playNote((Note) item);
        } else if (item instanceof Pause) {
            playPause((Pause) item);
        } else if (item instanceof Sequence) {
            playSequence((Sequence) item);
        }

        return null;
    }

    private void playNote(Note note) {
        System.out.println("Reproduciendo nota: " + note);
    }

    private void playPause(Pause pause) {
        System.out.println("Reproduciendo pausa: " + pause);
    }

    private void playSequence(Sequence sequence) {
        System.out.println("Reproduciendo secuencia: " + sequence);
        for (Object item : sequence.getElements()) {
            if (item instanceof Note) {
                playNote((Note) item);
            } else if (item instanceof Pause) {
                playPause((Pause) item);
            }
        }
    }

    class Note {
        String tone;
        String duration;
        int octave;

        Note(String tone, String duration, int octave) {
            this.tone = tone;
            this.duration = duration;
            this.octave = octave;
        }

        @Override
        public String toString() {
            return tone + duration + octave;
        }
    }

    class Pause {
        String duration;

        Pause(String duration) {
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "pause " + duration;
        }
    }

    class Sequence {
        private final List<Object> elements;

        Sequence() {
            elements = new ArrayLi|st<>();
        }

        void addElement(Object element) {
            elements.add(element);
        }

        List<Object> getElements() {
            return elements;
        }

        @Override
        public String toString() {
            return elements.toString();
        }
    }
}
