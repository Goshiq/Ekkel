import java.util.*;

public class _16 {
    public static void main(String[] args) {
        Set<String> mySet = new TreeSet<>();
        int result = 0;
        Collections.addAll(mySet, "A E I O U".split(" "));
        String phrase = "It is not a long sentence";
        System.out.println(mySet);
        for (String s: phrase.split(" ")) {
            int j = 0;
            for (int i = 0; i < s.length(); ++i) {
                Character ch = s.charAt(i);
                String temp = String.valueOf(ch).toUpperCase();
                if (mySet.contains(temp)) {
                    j++;
                }
            }
            System.out.println(s + ": " + j);
            result += j;
        }
        System.out.println("Total is: " + result);
    }
}
