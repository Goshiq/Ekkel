class Outer {
    private String  str;

    public Outer() {
        str = "Initialization";
        System.out.println("I am Outer!");
    }

    Inner   getInner() {
        return new Inner();
    }

    class Inner {
        public Inner() {
            System.out.println("I am Inner!");
        }

        @Override
        public String toString() {
            return str;
        }
    }
}

public class _1 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().getInner();
        System.out.println(inner);
    }
}
