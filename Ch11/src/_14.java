import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class _14 {
    public static void main(String[] args) {
        Random  random = new Random();
        int     integ;
        LinkedList<Integer> linkedList = new LinkedList<>();

        ListIterator<Integer> iterator = linkedList.listIterator();
        for (int i = 0; i < 11; ++i) {
            integ = random.nextInt(100);
            System.out.println("" + i + " " + integ);
            iterator.add(integ);
            if (i > 0) {
                if (i % 2 == 0) {
                    iterator.previous();
                }
            }
            else {
                iterator.previous();
            }
        }
        System.out.println(linkedList);
    }
}
