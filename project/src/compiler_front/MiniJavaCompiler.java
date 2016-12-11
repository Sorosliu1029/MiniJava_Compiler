package compiler_front;

import antlr_gen.MiniJavaLexer;
import antlr_gen.MiniJavaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import validation.CheckSymbols;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by SorosLiu on 16/12/10.
 */
public class MiniJavaCompiler {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        MiniJavaLexer lexer = new MiniJavaLexer(new ANTLRInputStream(is));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
//        parser.removeErrorListeners();
//        parser.addErrorListener(new ErrorReporter());
//        parser.setErrorHandler(new MiniJavaDefaultErrorStrategy());
//        parser.goal();
        new CheckSymbols().process(parser);
    }
}
