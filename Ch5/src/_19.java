public class _19 {
    public static void TTT(String... args) {
        for (String s: args) {
            System.out.println(s);
        }
    }

    public static void main(String... args) {
        TTT(new String[]{"a", "b", "c"});
        TTT("x", "y", "z");
        for (String ss: args) {
            System.out.println(ss);
        }
    }
}
