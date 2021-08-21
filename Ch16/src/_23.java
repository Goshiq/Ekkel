import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _23 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Random random = new Random();

        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("Before sorting: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}
