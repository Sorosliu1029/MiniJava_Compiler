package syntax_error;

/**
 * Created by SorosLiu on 16/12/11.
 */
class OperandMissing {
    public static void main(String[] a) {
        a = a + ;
        int b;
        b = && a;
    }
}
