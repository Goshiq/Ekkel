import java.util.Comparator;

// first part in #18
class SphereComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        BerylliumSphere sphere1 = (BerylliumSphere) o1;
        BerylliumSphere sphere2 = (BerylliumSphere) o2;
        return sphere1.compareTo(sphere2) * -1;
    }
}

public class _21 {
}
