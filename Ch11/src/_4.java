import java.util.*;

class Generator {
    List<String> data = new ArrayList<>();
    int i = 0;

    Generator() {
        data.add("Jurassic Park");
        data.add("South park");
        data.add("Linkin park");
        data.add("Gorky park");
        data.add("Dark park");
    }

    String  nextStr() {
        if (i == data.size())
            i = 0;
        return data.get(i++);
    }
}

public class _4 {
    public static void main(String[] args) {
        Generator   generator = new Generator();

        //array
        String[] array = new String[10];
        for (int i = 0; i < array.length; ++i) {
            array[i] = generator.nextStr();
        }
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            arrayList.add(generator.nextStr());
        }
        // LinkedList
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; ++i) {
            linkedList.add(generator.nextStr());
        }
        // HashSet
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < 10; ++i) {
            hashSet.add(generator.nextStr());
        }
        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 10; ++i) {
            linkedHashSet.add(generator.nextStr());
        }
        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        for (int i = 0; i < 10; ++i) {
            treeSet.add(generator.nextStr());
        }
        // HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; ++i) {
            hashMap.put(i, generator.nextStr());
        }
        // LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 10; ++i) {
            linkedHashMap.put(i, generator.nextStr());
        }
        // TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        for (int i = 0; i < 10; ++i) {
            treeMap.put(i, generator.nextStr());
        }

        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
        System.out.println(hashMap);
        System.out.println(linkedHashMap);
        System.out.println(treeMap);
    }
}
