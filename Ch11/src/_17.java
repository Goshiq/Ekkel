import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _17 {
    public static void main(String[] args) {
        Map<String, Gerbil> myMap = new HashMap<>();
        myMap.put("First", new Gerbil(1));
        myMap.put("Second", new Gerbil(2));
        myMap.put("Third", new Gerbil(3));
        Set<String> keys = myMap.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String tmp = iterator.next();
            System.out.print(tmp + ": ");
            myMap.get(tmp).hop();
        }
    }
}
