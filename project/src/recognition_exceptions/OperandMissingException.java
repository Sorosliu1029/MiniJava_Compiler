package recognition_exceptions;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

/**
 * Created by SorosLiu on 16/12/11.
 */
public class OperandMissingException extends RecognitionException{
    public OperandMissingException(Parser recognizer) {
        super(recognizer, recognizer.getInputStream(), recognizer.getContext());
        this.setOffendingToken(recognizer.getCurrentToken());
    }
}
