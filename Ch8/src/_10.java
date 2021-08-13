class Uno {
    void First() {
        System.out.println("The first method!");
    }

    void Second() {
        First();
        System.out.println("The second method with calling the First one!");
    }
}

class Duo extends Uno {
    @Override
    void Second() {
        System.out.println("It is a Overridden method in Duo!");
    }
}
public class _10 {
    public static void main(String[] args) {
        Uno uno = (Uno)(new Duo());
        uno.First();
        uno.Second();
    }
}
