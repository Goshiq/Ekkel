class TwoTuple<A, B> {
    public final A a;
    public final B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C c;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString() {
        return "ThreeTuple{"+
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

public class _3 {
    public static void main(String[] args) {
        ThreeTuple<Integer, String, Double> tuple = new ThreeTuple<>(1, "Hi", 22D);
        System.out.println(tuple);
    }
}
