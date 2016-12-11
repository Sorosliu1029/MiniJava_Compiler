package syntax_error;

/**
 * Created by SorosLiu on 16/12/11.
 */
class ParenthesisDismatch {
    public static void main(String[] a) {
        b = a.toString());
        b = a.toString(;
    }
}
