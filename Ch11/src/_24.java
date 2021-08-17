import java.util.*;

public class _24 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("3", "Third");
        map.put("1", "First");
        map.put("4", "Fourth");
        map.put("2", "Second");

        Set<Map.Entry<String, String>> pairs;
        pairs = map.entrySet();
        List<Map.Entry<String, String>> list = new ArrayList<>(pairs);
        System.out.println(list);
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println(list);
        System.out.println("Map before: " + map);
        for (Map.Entry<String, String> mm: list) {
            map.remove(mm.getKey());
            map.put(mm.getKey(), mm.getValue());
        }
        System.out.println("After: " + map);
    }
}
