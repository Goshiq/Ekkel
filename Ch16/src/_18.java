import java.util.Arrays;

public class _18 {
    public static void main(String[] args) {
        BerylliumSphere[] array = new BerylliumSphere[5];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new BerylliumSphere(array.length / (i + 1));
        }
        System.out.println(Arrays.toString(array));
        BerylliumSphere[] copied = new BerylliumSphere[5];
        System.arraycopy(array, 0, copied, 0, array.length);

        System.out.println("Source: " + Arrays.toString(array));
        System.out.println("Copy: " + Arrays.toString(copied));

        Arrays.sort(array);
        System.out.println("After normal sort: " + Arrays.toString(array));
        Arrays.sort(array, new SphereComparator());
        System.out.println("After reverse sort: " + Arrays.toString(array));
    }
}
