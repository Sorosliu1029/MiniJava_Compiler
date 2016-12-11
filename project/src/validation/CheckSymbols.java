package validation;

import antlr_gen.MiniJavaParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by SorosLiu on 16/12/11.
 */
public class CheckSymbols {
    public void process(MiniJavaParser parser) {
        parser.setBuildParseTree(true);
        ParseTree tree = parser.goal();

        ParseTreeWalker walker = new ParseTreeWalker();
        DefPhase def = new DefPhase();
        walker.walk(def, tree);
    }
}
