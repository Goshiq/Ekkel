import java.util.*;

public class _18 {
    public static void main(String[] args) {
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(3333, 3);
        myMap.put(1111, 1);
        myMap.put(2222, 2);
        System.out.println(myMap);
        System.out.println("Hashcodes:\n1: " + myMap.get(1111).hashCode());
        System.out.println("2: " + myMap.get(2222).hashCode());
        System.out.println("3: " + myMap.get(3333).hashCode());
        List<Integer> myList = new ArrayList<>(myMap.keySet());
        System.out.println("Before sorting: " + myList);
        Collections.sort(myList);
        System.out.println("After sorting: " + myList);
        Map<Integer, Integer> newMap = new LinkedHashMap<>();
        for (Integer i: myList) {
            newMap.put(i, myMap.get(i));
        }
        System.out.println(newMap);
    }
}
