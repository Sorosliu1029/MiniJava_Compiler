package error_handle;

import compiler_utils.LevenshteinDistance;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;
import recognition_exceptions.OperandMissingException;
import recognition_exceptions.ParenthesisDismatchException;
import recognition_exceptions.SemicolonMissingException;

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
        } else if (e instanceof OperandMissingException) {
            System.err.println("[Syntax Error]: line " + line + ":" + charPositionInline + "\t" + msg);
        } else if (e instanceof ParenthesisDismatchException) {
            System.err.println("[Syntax Error]: line " + line + ":" + charPositionInline + "\t" + msg);
        } else if (e instanceof SemicolonMissingException) {
            System.err.println("[Syntax Error]: line " + line + ":" + charPositionInline + "\t" + msg);
        } else {
            System.err.println("line " + line + ":" + charPositionInline + " at " + offendingSymbol + ": " + msg);
        }
    }

    private void reportInputMismatchException(Recognizer recognizer, Object offendingSymbol, int line,
                                              int charPositionInline, String msg, RecognitionException e) {
        CommonToken token = (CommonToken) e.getOffendingToken();
        IntervalSet expectedTokens = e.getExpectedTokens();
        Vocabulary vocabulary = recognizer.getVocabulary();
        String shouldBe = this.reportKeywordMismatchException(token.getText(), expectedTokens.toString(vocabulary));
        String reservedWord = this.reportReservedWordMisuseException(recognizer, token.getText());
        if (!shouldBe.equals("")) {
            System.err.println("[Lexical Error]: line " + line + ":" + charPositionInline + "\tWrong Keyword: " + token.getText()
                    + "\tExpected Tokens: " + expectedTokens.toString(vocabulary) + "\tSuggested Keyword: " + shouldBe);
        } else if (!reservedWord.equals("")) {
            System.err.println("[Syntax Error]: line " + line + ":" + charPositionInline + "\tMisuse Reserved Word: " + reservedWord
                    + "\tShould be: " + expectedTokens.toString(vocabulary));
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

    private String reportReservedWordMisuseException(Recognizer recognizer, String wrongWord) {
        String result = "";
        Vocabulary vocabulary = recognizer.getVocabulary();
        int maxTokenType = vocabulary.getMaxTokenType();
        for (int i = 0; i < maxTokenType; i++) {
            String tokenName = vocabulary.getDisplayName(i).replace("'", "");
            if (wrongWord.equals(tokenName)) {
                result = tokenName;
            }
        }
        return result;
    }

}
