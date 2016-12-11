package error_handle;

import compiler_utils.LevenshteinDistance;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

/**
 * Created by SorosLiu on 16/12/10.
 */

public class ErrorReporter extends MiniJavaBaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInline,
                            String msg, RecognitionException e) {

        this.errorReporter(recognizer, offendingSymbol, line, charPositionInline, msg, e);
        this.underlineError(recognizer, (Token) offendingSymbol, line, charPositionInline);
    }

    private void errorReporter(Recognizer recognizer, Object offendingSymbol, int line, int charPositionInline,
                              String msg, RecognitionException e) {
        System.out.println(e);
        if (e instanceof InputMismatchException) {
            this.reportInputMismatchException(recognizer, offendingSymbol, line, charPositionInline, msg, e);
        } else {
            System.err.println("line " + line + ":" + charPositionInline + " at " + offendingSymbol + ": " + msg);
        }
    }

    private void reportInputMismatchException(Recognizer recognizer, Object offendingSymbol, int line,
                                              int charPositionInline, String msg, RecognitionException e) {
        CommonToken token = (CommonToken)e.getOffendingToken();
        IntervalSet expectedTokens = e.getExpectedTokens();
        Vocabulary vocabulary = recognizer.getVocabulary();
        String shouldBe = this.reportKeywordMismatchException(token.getText(), expectedTokens.toString(vocabulary));
        if (!shouldBe.equals("")) {
            System.err.println("[Lexical Error]: line "+line+":"+charPositionInline + "\n\tWrong Keyword: " + token.getText()
                    + "\tExpected Tokens: " + expectedTokens.toString(vocabulary) + "\n\tSuggested Keyword: " + shouldBe);
        } else {
            System.err.println("line " + line + ":" + charPositionInline + " at " + offendingSymbol + ": " + msg);
        }
    }

    private String reportKeywordMismatchException(String wrongWord, String expectedTokens) {
        String[] expected = expectedTokens.replace("{", "").replace("}", "").split(",");
        double maxSimilarity = 0.5;
        String similarest = "";
        for (String anExpected : expected) {
            String tmp = anExpected.trim().replace("'", "");
            double similarity = LevenshteinDistance.similarity(wrongWord, tmp);
            if (similarity > maxSimilarity) {
                maxSimilarity = similarity;
                similarest = tmp;
            }
        }
        return similarest;
    }

}
