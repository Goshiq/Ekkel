import java.util.ArrayList;
import java.util.Random;

class RandomList<T> {
    ArrayList<T> storage = new ArrayList<>();
    Random random = new Random();

    public void add(T item) {
        storage.add(item);
    }

    public T getRandom() {
        return storage.get(random.nextInt(storage.size()));
    }
}

public class _6 {
    public static void main(String[] args) {
        RandomList<Integer> myList = new RandomList<>();
        RandomList<Character> charList = new RandomList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; ++i) {
            myList.add(i * i);
            charList.add((char)(i + '0'));
        }
        for (int i = 0; i < 10; ++i) {
            System.out.println(myList.getRandom());
            stringBuilder.append(charList.getRandom());
        }
        System.out.println(new String(stringBuilder));
    }
}
