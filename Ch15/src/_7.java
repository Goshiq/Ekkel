import java.util.Iterator;

interface Generator<T> {
    T next();
}

class IterableFibonacci implements Iterable<Integer> {
    int count = 0;
    int n = 0;

//    Generator<Integer> generator = new Generator<Integer>() {
//        @Override
//        public Integer next() {
//            return fib(count++);
//        }
//    };

    public IterableFibonacci(int count) {
        this.count = count;
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return (fib(n - 2) + fib(n - 1));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Integer next() {
                count--;
                return fib(n++);
            }
        };
    }
}

public class _7 {
    public static void main(String[] args) {
//        IterableFibonacci iterableFibonacci = new IterableFibonacci();
//        for (int i = 0; i < 5; ++i) {
//            System.out.println(iterableFibonacci.next());
//        }
        for (int i : new IterableFibonacci(5))
            System.out.println(i + " ");
    }
}
