public class _9 {
    public static class Uno {
        public Uno() {
            System.out.println("Constructor with no args");
        }

        public Uno (String s) {
            this();
            System.out.println("Constructor with arg String... " + s);
        }
    }

    public static void main(String[] args) {
        Human h1 = new Human(1, "Man");
    }
}
