public class _12 {
    public static void main(String[] args) {
        int i = 1111;
        int k, l;

        System.out.println("i =\t\t" + Integer.toBinaryString(i));
        i <<= 1;
        System.out.println("i << 1\t" + Integer.toBinaryString(i));
        for (int j = 0; j <= Integer.toBinaryString(i).length(); ++j) {
            k = i >>> j;
            l = ~i >> j;
            System.out.println("Iter" + j + ":\t" + Integer.toBinaryString(k));
            System.out.println("Iter" + j + ":\t" + Integer.toBinaryString(l));
        }
    }
}
