class A {
    public A(int i) {
        System.out.println("Constructor A with i");
    }
}

class B {
    public B(int i) {
        System.out.println("Constructor B");
    }
}

class C extends A {
    B b;

    public C(int i) {
        super(i);
        System.out.println("C!");
        b = new B(i);
    }
}
public class _5 {
    public static void main(String[] args) {
        C c = new C(5);
    }
}
