import java.util.*;

public class _20 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        Set<String> mySet = new HashSet<>();
        String  str = "A E I O U";
        String  example = "here is a new string with some words";
        Collections.addAll(mySet, str.split(" "));
        for (String s: example.split(" ")) {
            for (int i = 0; i < s.length(); ++i) {
                String letter = String.valueOf(s.charAt(i));
                if (str.contains(letter.toUpperCase())) {
                    Integer value = myMap.get(letter.toUpperCase());
                    if (value == null) {
                        myMap.put(letter.toUpperCase(), 1);
                    }
                    else {
                        myMap.put(letter.toUpperCase(), value + 1);
                    }
                }
            }
        }
        System.out.println(myMap);
    }
}
