class BerylliumSphere {
    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return "Sphere #" + id;
    }
}

public class _1 {
    public static void process(BerylliumSphere[] array) {
        for (BerylliumSphere berylliumSphere : array) {
            System.out.println(berylliumSphere);
        }
    }

    public static void main(String[] args) {
        BerylliumSphere[] array = {new BerylliumSphere(), new BerylliumSphere()};
        process(array);
        process(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()});
//        process({new BerylliumSphere(), new BerylliumSphere()}); // does not work
    }
}
