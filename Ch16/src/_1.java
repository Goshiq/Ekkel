class BerylliumSphere implements Comparable{
    private static long count = 0;
    private long id = count++;

    @Override
    public String toString() {
        return "Sphere #" + id;
    }

    public BerylliumSphere() {
    }

    public BerylliumSphere(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(Object o) {
        BerylliumSphere temp = (BerylliumSphere) o;
        return (Long.compare(id, temp.getId()));
//        return (id < temp.getId() ? -1 : (id == temp.getId() ? 0 : 1)); //manual comparison
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
