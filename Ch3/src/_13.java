public class _13 {
    public static void showChar(char ch) {
        System.out.println(Integer.toBinaryString((int) ch));
    }

    public static void main(String[] args) {
        showChar('a');
        showChar('0');
        showChar('\n');
        showChar(' ');
    }
}
