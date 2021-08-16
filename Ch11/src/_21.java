import java.util.*;

public class _21 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        String str = "A new string with some words. And there are a bit of repetitive letters. Let's check this out!" +
                "Here are some random words. A a a aaa";
        List<String> strList = Arrays.asList(str.split(" "));
        for (String s: strList) {
            Integer num = myMap.get(s);
            if (num == null) {
                myMap.put(s, 1);
            }
            else {
                myMap.put(s, num + 1);
            }
        }
        System.out.println("List before sorting: " + strList);
        Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);
        System.out.println("List after sorting: " + strList);
        Set<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        set.addAll(strList);
        for (String s: set) {
            System.out.println("Key: " + s + "\nValue: " + myMap.get(s) + "\n");
        }
    }
}
