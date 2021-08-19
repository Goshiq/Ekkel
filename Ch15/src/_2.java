class Example<T> {
    private T b;
    private T c;
    private T a;

    public Example(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }
}

public class _2 {
    public static void main(String[] args) {
        Example<Integer> hi = new Example<>(1, 2, 3);
        System.out.println(hi.getA());
        System.out.println(hi.getB());
        System.out.println(hi.getC());
        hi.setA(99);
        System.out.println(hi.getA());
    }
}
