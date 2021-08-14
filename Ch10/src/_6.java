class ClosedClass {
    private int i =0;
    private void say() {
        System.out.println("Hi");
    }

    void checker() {
        InnerClass innerClass = new InnerClass();
        System.out.println("i = " + i);
        innerClass.aMethod();
        System.out.println("i after = " + i);
//        System.out.println(a);  // can't see a variable
    }

    class InnerClass {
        private int a = 0;

        void aMethod() {
            i = 100;
            say();
        }
    }
}

public class _6 {
    public static void main(String[] args) {
        ClosedClass closedClass = new ClosedClass();
        closedClass.checker();
    }
}
