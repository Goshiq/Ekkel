import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class _12 {

    static void fill(List<Integer> list, int size) {
        Random random = new Random();
        for (int i = 0; i < size; ++i) {
            list.add(random.nextInt(100));
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        List<Integer> integerList2 = new LinkedList<>();
        fill(integerList, 10);
        fill(integerList2, 10);
        System.out.println("List #1: " + integerList);
        System.out.println("List #2: " + integerList2);
        ListIterator<Integer> it1 = integerList.listIterator(integerList.size());
        ListIterator<Integer> it2 = integerList2.listIterator();
        while (it2.hasNext()) {
            it2.next();
            it2.set(it1.previous());
        }
        System.out.println("AFTER SWAP!");
        System.out.println("List #1: " + integerList);
        System.out.println("List #2: " + integerList2);
        integerList.clear();
        integerList2.clear();

        // another one method
        System.out.println("\nTHE SECOND PART");
        fill(integerList, 10);
        fill(integerList2, 10);
        System.out.println("List #1: " + integerList);
        System.out.println("List #2: " + integerList2);
        it1 = integerList.listIterator();
        it2 = integerList2.listIterator(integerList2.size());
        while (it2.hasPrevious()) {
            it2.previous();
            it2.set(it1.next());
        }
        System.out.println("AFTER SWAP!");
        System.out.println("List #1: " + integerList);
        System.out.println("List #2: " + integerList2);
    }

}
