package validation;

import antlr_gen.MiniJavaParser;
import compiler_utils.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by SorosLiu on 16/12/11.
 */
public class CheckSymbols {
    public static Symbol.Type getType(int tokenType) {
        switch (tokenType) {
            case MiniJavaParser.K_INT_ARRAY:
                return Symbol.Type.tINTARRAY;
            case MiniJavaParser.K_INT:
                return Symbol.Type.tINT;
            case MiniJavaParser.K_BOOLEAN:
                return Symbol.Type.tBOOLEAN;
            case MiniJavaParser.ID:
                return Symbol.Type.tCLASS;
        }
        return Symbol.Type.tINVALID;
    }

    public void process(MiniJavaParser parser) {
        parser.setBuildParseTree(true);
        ParseTree tree = parser.goal();

        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);
    }
}
