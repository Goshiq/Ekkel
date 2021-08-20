import java.util.ArrayList;

public class _9 {
    public static <A, B, C> void say(A a, B b, C c, Integer i) {
        System.out.println("A: " + a.getClass().getSimpleName() + "\nB: " + b.getClass().getSimpleName() + "\nC: "
                + c.getClass().getSimpleName() + "\nI: " + i.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        say("Hi", 123, 'a', 222);
    }
}
