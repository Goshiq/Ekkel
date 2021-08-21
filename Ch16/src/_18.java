import java.util.Arrays;

public class _18 {
    public static void main(String[] args) {
        BerylliumSphere[] array = new BerylliumSphere[5];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new BerylliumSphere();
        }
        BerylliumSphere[] copied = new BerylliumSphere[5];
        System.arraycopy(array, 0, copied, 0, array.length);

        System.out.println("Source: " + Arrays.toString(array));
        System.out.println("Copy: " + Arrays.toString(copied));
    }
}
