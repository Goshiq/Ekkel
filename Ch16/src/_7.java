import java.util.Arrays;

public class _7 {
    public static BerylliumSphere[][][] newSpheres(int fSize, int sSize, int tSize) {
        // do not forget to check arguments
        BerylliumSphere[][][] result = new BerylliumSphere[fSize][sSize][tSize];
        for (int i = 0; i < fSize; ++i) {
            for (int j = 0; j < sSize; ++j) {
                for (int k = 0; k < tSize; ++k) {
                    result[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (BerylliumSphere[][] outer: newSpheres(2, 2, 2)) {
            for (BerylliumSphere[] inner: outer) {
                for (BerylliumSphere berylliumSphere: inner) {
                    System.out.println(berylliumSphere);
                }
            }
        }
    }
}
