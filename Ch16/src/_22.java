import java.util.Arrays;
import java.util.Random;

public class _22 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array: " + Arrays.toString(array));
        int index = 9;
        // It is wrong, because the array is unsorted
        System.out.println("Result for index " + index + ": " + Arrays.binarySearch(array, array[9]));
        Arrays.sort(array);
        System.out.println("Result after sorting for index " + index + ": " + Arrays.binarySearch(array, array[9]));
    }
}
