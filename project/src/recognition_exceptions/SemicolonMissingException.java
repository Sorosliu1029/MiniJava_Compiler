package recognition_exceptions;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

/**
 * Created by SorosLiu on 16/12/11.
 */
public class SemicolonMissingException extends RecognitionException{
    public SemicolonMissingException(Parser recognizer) {
        super(recognizer, recognizer.getInputStream(), recognizer.getContext());
        this.setOffendingToken(recognizer.getCurrentToken());
    }
}
