class Final19 {
    final String name;

    public Final19() {
        name = "keke";
    }

    public Final19(String name) {
        this.name = name;
    }
}

public class _19 {
    public static void main(String[] args) {
        Final19 final19 = new Final19("Asso");
        System.out.println(final19.name);
        Final19 final20 = new Final19();
        System.out.println(final20.name);
//        final19.name = "";
    }
}
