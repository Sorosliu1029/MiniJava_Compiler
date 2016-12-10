package error_handle;

import org.antlr.v4.runtime.*;

/**
 * Created by SorosLiu on 16/12/10.
 */

public class LexicalErrorHandler extends MiniJavaBaseErrorListener{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInline,
                            String msg, RecognitionException e) {

        System.err.println("line " + line + ":" + charPositionInline + " at " + offendingSymbol + ": " + msg);
        underlineError(recognizer, (Token)offendingSymbol, line, charPositionInline);
    }

}
