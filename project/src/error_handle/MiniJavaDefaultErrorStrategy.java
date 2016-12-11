package error_handle;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;
import recognition_exceptions.SemicolonMissingException;

/**
 * Created by SorosLiu on 16/12/11.
 */
public class MiniJavaDefaultErrorStrategy extends DefaultErrorStrategy {
    @Override
    protected void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String missing = expecting.toString(recognizer.getVocabulary());
            String error = this.getTokenErrorDisplay(t);
            if (missing.equals("';'")) {
                recognizer.notifyErrorListeners(t, "missing " + missing + " at " + error, new SemicolonMissingException(recognizer));
            } else {
                recognizer.notifyErrorListeners(t, "missing " + missing + " at " + error, (RecognitionException) null);
            }
        }
    }
}
