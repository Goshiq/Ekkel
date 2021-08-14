class Outer5 {
    public Outer5() {
        System.out.println("It is an Outer constructor");
    }

    class Inner5 {
        public Inner5() {
            System.out.println("It is an Inner constructor");
        }

        public void say() {
            System.out.println("keke");
        }
    }
}

public class _5 {
    public static void main(String[] args) {
        Outer5 item = new Outer5();
        Outer5.Inner5 itemIn= item.new Inner5();
        itemIn.say();
    }
}
