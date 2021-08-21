import java.util.Arrays;
import java.util.Random;

public class _3 {
    public static Double[][] process (int fSize, int sSize, double start, double end) {
        if (fSize < 0 || sSize < 0 || start > end) {
            throw new IllegalArgumentException("Wrong arguments");
        }
        Random random = new Random();
        Double[][] result = new Double[fSize][sSize];
        for (int i = 0; i < fSize; ++i) {
            for (int j = 0; j < sSize; ++j) {
                double val = random.nextDouble();
                int piece = random.nextInt((int)end);
                val += piece;
                while (!(val + piece >= start && val + piece <= end)) {
                    piece = random.nextInt((int)end);
                }
                result[i][j] = val + piece;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(process(5, 2, 4d, 5d)));
    }
}
