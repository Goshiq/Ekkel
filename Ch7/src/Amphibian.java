class Unit {
    void breath() {
        System.out.println("...");
    }
    void sayKva() {
        System.out.println("xxx");
    }
}

public class Amphibian extends Unit{
    void sayKva() {
        System.out.println("???");
    }
}

class Frog extends Amphibian {

    @Override
    void sayKva() {
        System.out.println("Kva-kva");
    }

    public static void main(String[] args) {
        Frog    frog = new Frog();
        Unit   amphibian = (Unit) frog;
        amphibian.sayKva();
        frog.breath();
    }
}
