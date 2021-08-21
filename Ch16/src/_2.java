public class _2 {
    public static BerylliumSphere[] getArray(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Wrong size of the array");
        }
        BerylliumSphere[] result = new BerylliumSphere[n];
        for (int i = 0; i < n; ++i) {
            result[i] = new BerylliumSphere();
        }
        return result;
    }

    public static void main(String[] args) {
        for (BerylliumSphere berylliumSphere: getArray(5)) {
            System.out.println(berylliumSphere);
        }
    }
}
