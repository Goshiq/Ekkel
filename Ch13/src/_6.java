class Primitives {
    int i = 96;
    long l = 33L;
    float f = 0.99f;
    double d = 3.1415926d;

    @Override
    public String toString() {
        return String.format("Result is:\nint: %d\nlong: %d\nfloat: %f\ndouble: %.25f\n", i, l, f, d);
    }
}

public class _6 {
    public static void main(String[] args) {
        Primitives primitives = new Primitives();
        System.out.println(primitives);
    }
}
