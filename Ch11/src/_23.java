import java.util.*;

public class _23 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();
        Collection<Integer> mins;
        Integer temp;
        Integer value;
        Integer min = 0;
        for (int i = 0; i < 1000; ++i) {
            temp = random.nextInt(10);
            value = map.get(temp);
            mins = map.values();
            List<Integer> list = new ArrayList<>(mins);
            Collections.sort(list);
            if (value == null) {
                map.put(temp, 1);
            }
            else if (value <= list.get(0)){
                map.put(temp, value + 1);
            }
        }
        System.out.println(map);
    }
}
