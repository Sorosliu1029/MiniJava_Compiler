package semantic_error;

/**
 * Created by SorosLiu on 16/12/11.
 */
class VariableDismatch {
    public static void main(String[] a) {
        System.out.println(new A().B(10));
    }
}

class A {

    public int B(int c) {
        int[] d;
        boolean e;
        d = dd;
        while (ee) {
            dd[c] = 1;
        }
        return f;
    }
}
