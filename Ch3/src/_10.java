public class _10 {
    public static void main(String[] args) {
        int i1 = 0x01;
        int i2 = 0x10;

        System.out.println(i1 + " = i1 = " + Integer.toBinaryString(i1));
        System.out.println(i2 + " = i2 = " + Integer.toBinaryString(i2));
        System.out.println((i1 ^ i2) + " = ^ = " + Integer.toBinaryString(i1 ^ i2));
        System.out.println((i1 & i2) + " = & = " + Integer.toBinaryString(i1 & i2));
        System.out.println((i1 | i2) + " = | = " + Integer.toBinaryString(i1 | i2));
        System.out.println(~i1 + " = ~ = " + Integer.toBinaryString(~i1));
        System.out.println(~i2 + " = ~ = " + Integer.toBinaryString(~i2));

    }
}
