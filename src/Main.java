import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String input = "";
        try {
            input = new String(Files.readAllBytes(Paths.get("input.isi")));
        } catch (IOException e) {
            System.err.println("Error leyendo el archivo de entrada: " + e.getMessage());
            return;
        }

        CharStream charStream = CharStreams.fromString(input);

        LanguageLexer lexer = new LanguageLexer(charStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LanguageParser parser = new LanguageParser(tokens);

        ParseTree tree = parser.programa();

        System.out.println(tree.toStringTree(parser));

        LanguageVisitorExt visitor = new LanguageVisitorExt();
        visitor.visit(tree);
    }
}
