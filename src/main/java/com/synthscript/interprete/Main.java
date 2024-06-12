package com.synthscript.interprete;

import com.synthscript.interprete.LanguageLexer;
import com.synthscript.interprete.LanguageParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String input = "nota myNota = nota(A, 4, 3);";
        
        LanguageLexer lexer = new LanguageLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LanguageParser parser = new LanguageParser(tokens);
        
        LanguageParser.ProgramaContext tree = parser.programa();
        
        System.out.println(tree.toStringTree(parser));
    }
}
