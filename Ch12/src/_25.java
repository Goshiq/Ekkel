class Ex1 extends Exception {}

class Ex2 extends Exception {}

class Ex3 extends Exception {}

class A {
    public void doIt() {
        try {
            throw new Ex1();
        } catch (Ex1 e) {
            e.printStackTrace();
        }
    }
}

class B extends A {
    public void doIt() {
        try {
            throw new Ex2();
        }
        catch (Ex2 ex2) {
            ex2.printStackTrace();
        }
    }
}

class C extends B {
    public void doIt() {
        try {
            throw new Ex3();
        }
        catch (Ex3 ex3) {
            ex3.printStackTrace();
        }
    }
}

public class _25 {
    public static void main(String[] args) {
        C c = new C();
        A a = (A)c;
        a.doIt();
    }
}
