public class _11 {
    public static void main(String[] args) {
        int i1 = 0x1000;
        int i2 = 0x1111;

        System.out.println(Integer.toBinaryString(6));
        System.out.println("i1 = " + Integer.toBinaryString(i1));
        System.out.println("i2 = " + Integer.toBinaryString(i2));
        for (int i = 0; i < 14; ++i) {
            System.out.println("i1 >> " + i + " = " + Integer.toBinaryString(i1 >> i));
        }
        for (int i = 0; i < 14; ++i) {
            System.out.println("i2 >> " + i + " = " + Integer.toBinaryString(i2 >> i));
        }
    }
}
