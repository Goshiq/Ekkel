import java.util.*;

public class _25 {
    public static void main(String[] args) {
        String str = "It is a common phrase. We will use it as a text source";
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> temp;
        Integer position = 0;
        for (String s: str.split(" ")) {
           if (map.containsKey(s)) {
               temp = map.get(s);
               temp.add(position);
           }
           else {
               temp = new ArrayList<>();
               temp.add(position);
               map.put(s, temp);
           }
           position++;
        }
        System.out.println("25:\n" + map + "\n\n26:");


        // #26
        Collection<String> kk = map.keySet();
        List<String> keys = new ArrayList<>(kk);
        int flag = 0;
        int prev = -1;
        while (prev != flag) {
            Iterator<String> iterator = keys.iterator();
            prev = flag;
            while (iterator.hasNext()) {
                String tmpString = iterator.next();
                ArrayList<Integer> values = map.get(tmpString);
                if (values.contains(flag)) {
                    System.out.print(tmpString + " ");
                    flag++;
                }
            }
        }
    }
}
