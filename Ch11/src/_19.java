import java.util.*;

public class _19 {
    public static void main(String[] args) {
        Set<Integer> newSet = new HashSet<>();
        newSet.add(3333);
        newSet.add(1111);
        newSet.add(2222);
        System.out.println("Unsorted HashSet: " + newSet);
        List<Integer> myList = new ArrayList<>(newSet);
        Collections.sort(myList);
        System.out.println("Sorted List: " + myList);
        Set<Integer> mySet = new LinkedHashSet<>(myList);
        System.out.println("LinkedHashSet: " + mySet);
    }
}
