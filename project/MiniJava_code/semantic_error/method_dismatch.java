package semantic_error;

/**
 * Created by SorosLiu on 16/12/11.
 */
class MethodDismatch {
    public static void main(String[] a) {
        System.out.println(new A().B(10));
    }
}

class C {
    public int B(int c) {
        return c;
    }

    public boolean D() {
        return true;
    }

    public int[] E() {
        return new int[10];
    }

    public int F(int c) {
        int b;
        b = this.BB(c);
        boolean d;
        d = this.DD();
        int[] e;
        e = this.E();
        return 233333;
    }
}