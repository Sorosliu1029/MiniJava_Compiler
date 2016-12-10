package error_handle;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

/**
 * Created by SorosLiu on 16/12/10.
 */

public class LexicalErrorHandler extends MiniJavaBaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInline,
                            String msg, RecognitionException e) {

        this.errorHandler(recognizer, offendingSymbol, line, charPositionInline, msg, e);
        this.underlineError(recognizer, (Token) offendingSymbol, line, charPositionInline);
    }

    private void errorHandler(Recognizer recognizer, Object offendingSymbol, int line, int charPositionInline,
                              String msg, RecognitionException e) {
        if (e instanceof InputMismatchException) {
            this.handleInputMismatchException(recognizer, offendingSymbol, line, charPositionInline, msg, e);
        } else {
            System.err.println("line " + line + ":" + charPositionInline + " at " + offendingSymbol + ": " + msg);
        }
    }

    private void handleInputMismatchException(Recognizer recognizer, Object offendingSymbol, int line,
                                              int charPositionInline, String msg, RecognitionException e) {
        CommonToken token = (CommonToken)e.getOffendingToken();
        IntervalSet expectedTokens = e.getExpectedTokens();
        Vocabulary vocabulary = recognizer.getVocabulary();
        System.err.println("[Lexical Error]: line "+line+":"+charPositionInline + "\n\tWrong Keyword: " + token.getText()
        + "\tExpected Tokens: " + expectedTokens.toString(vocabulary));
    }

}
