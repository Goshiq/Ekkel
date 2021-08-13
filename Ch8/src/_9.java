import java.util.Random;

abstract class Rodent {
    public Rodent() {
        System.out.println("Rodent constructor");
    }

    public void hrum() {
        System.out.println("Rodent hrums");
    }

    public void say() {
        System.out.println("Rodent: ...");
    }
}

class Mouse extends Rodent {
    public Mouse() {
        System.out.println("Mouse constructor");
    }

    @Override
    public void hrum() {
        System.out.println("Mouse hrums");
    }

    @Override
    public void say() {
        System.out.println("Mouse: pi-pi-pi");
    }
}

class Hamster extends Rodent {
    public Hamster() {
        System.out.println("Hamster constructor");
    }

    @Override
    public void hrum() {
        System.out.println("Hamster hrums");
    }

    @Override
    public void say() {
        System.out.println("Hamster: I can't say anything!");
    }
}

class RodentGenerator {
    static public Rodent next() {
        Random random = new Random();
        int i = random.nextInt(3);
        switch (i) {
            case 2:
                return new Hamster();
            default:
                return new Mouse();
        }
    }
}

public class _9 {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[5];
        for (int i = 0; i < 5; ++i) {
            rodents[i] = RodentGenerator.next();
        }
        for (Rodent r: rodents) {
            r.hrum();
            r.say();
        }
    }
}
