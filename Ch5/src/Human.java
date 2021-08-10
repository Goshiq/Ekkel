public class Human implements Speakable {
    public Human() {
        System.out.println("Default Constructor");
    }

    public Human(int i, String s) {
        this();
        System.out.println("Constructor #1");
    }

    public Human(String s, int i) {
        System.out.println("Constructor #2");
    }

    @Override
    public void say() {
        System.out.println("Hello!");
    }

}
