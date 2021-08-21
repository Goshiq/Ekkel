import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _25 {
    public static <T> List<T> getReversed(List<T> array) {
        List<T> result = new ArrayList<>();
        for (int i = array.size() - 1; i >= 0; --i){
            result.add(array.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            array.add(random.nextInt(100));
        }
        System.out.println("Array before reverse:\n" + array);
        System.out.println("Array after reverse:\n" + getReversed(array));

    }
}