import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

class Coffee {
    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + id;
    }
}

class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = new Class[]{Coffee1.class, Coffee2.class, Coffee3.class, Coffee4.class, Coffee5.class};
    private static Random random = new Random();

    public CoffeeGenerator() {}

    private int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].getDeclaredConstructor(null).newInstance();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {
            int count = size;
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Coffee next() {
                count--;
                return CoffeeGenerator.this.next();
            }
        };
    }
}

class Coffee1 extends Coffee{}
class Coffee2 extends Coffee{}
class Coffee3 extends Coffee{}
class Coffee4 extends Coffee{}
class Coffee5 extends Coffee{}

class Generators {
    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            list.add(gen.next());
        }
        return list;
    }

    public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            set.add(gen.next());
        }
        return set;
    }

    public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            queue.add(gen.next());
        }
        return queue;
    }
}

public class _13 {
    public static void main(String[] args) {
//        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
//        for (int i = 0; i < 5; ++i) {
//            System.out.println(coffeeGenerator.next());
//        }
//        for (Coffee coffee: new CoffeeGenerator(3)) {
//            System.out.println(coffee);
//        }
        List<Coffee> list = Generators.fill(new ArrayList<>(), new CoffeeGenerator(), 5);
        System.out.println(list);
        Queue<Coffee> queue = Generators.fill(new LinkedBlockingQueue<>(), new CoffeeGenerator(), 5);
        System.out.println(queue);
        Set<Coffee> set = Generators.fill(new LinkedHashSet<>(), new CoffeeGenerator(), 5);
        System.out.println(set);
    }
}
