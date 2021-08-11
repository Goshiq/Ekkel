public class Amphibian {
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
        Amphibian   amphibian = (Amphibian)frog;
        amphibian.sayKva();
    }
}
