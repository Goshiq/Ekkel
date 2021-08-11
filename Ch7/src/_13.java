class Base13 {
    private String name = "Base13";

    void kek(int i) {
        System.out.println("I+ " + i);
    }

    void kek(float i) {
        System.out.println("float+ " + i);
    }

    void kek(char i) {
        System.out.println("char+ " + i);
    }
}

class Child13 extends Base13 {
    void kek(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        Child13 child13 = new Child13();
        child13.kek("Hello");
        child13.kek(5);
        child13.kek(5f);
        child13.kek('a');
    }
}
public class _13 {
}
