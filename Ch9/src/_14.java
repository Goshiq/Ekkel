interface Uno {
    void    kek();
    void    lol();
}

interface Duo {
    void    tt();
    void    qq();
}

interface Trio {
    void    uu();
    void    oo();
}

interface Quad extends Uno, Duo, Trio {
    void    zzz();
}

abstract class MyAbstract {
    abstract void anAbstractMethod();
}

class MyClass extends MyAbstract implements Quad {
    @Override
    void anAbstractMethod() {
        System.out.println("An abstract method");
    }

    @Override
    public void kek() {
        System.out.println("Kek");
    }

    @Override
    public void lol() {
        System.out.println("Lol");
    }

    @Override
    public void tt() {
        System.out.println("T_T");
    }

    @Override
    public void qq() {
        System.out.println("q_q");
    }

    @Override
    public void uu() {
        System.out.println("U_U");
    }

    @Override
    public void oo() {
        System.out.println("o_0");
    }

    @Override
    public void zzz() {
        System.out.println("Zzz...");
    }
}

public class _14 {
    static void first(Uno uno) {
        System.out.println("The first Interface");
        uno.kek();
        uno.lol();
        System.out.println("---");
    }

    static void second(Duo duo) {
        System.out.println("The second Interface");
        duo.qq();
        duo.tt();
        System.out.println("---");
    }

    static void third(Trio trio) {
        System.out.println("The third Interface");
        trio.oo();
        trio.uu();
        System.out.println("---");
    }

    static void fourth(Quad quad) {
        System.out.println("The fourth interface");
        quad.zzz();
        System.out.println("---");
    }

    static void fifth(MyAbstract myAbstract) {
        myAbstract.anAbstractMethod();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        first(myClass);
        second(myClass);
        third(myClass);
        fourth(myClass);
        fifth(myClass);
    }
}
