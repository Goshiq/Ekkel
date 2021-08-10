public class _14 {
    public static void showStr(String s1, String s2) {
        System.out.println("s1: " + s1 + "\ns2: " + s2);
        System.out.println("s1 == s2\t\t" + (s1 == s2));
        System.out.println("s1 != s2\t\t" + (s1 != s2));
        System.out.println("s1 equals s2\t" + (s1.equals(s2)));
    }

    public static void main(String[] args) {
        showStr(new String("Abc"), new String("Abcd"));
        showStr(new String("Abc"), new String("Abc"));
    }
}
