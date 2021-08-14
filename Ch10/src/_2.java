import java.util.Arrays;

interface Selector {
    Object  current();
    boolean end();
    void    next();
    Sequence    outer();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public boolean end() {
            return items.length == i;
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }

        public Sequence outer() {
            return Sequence.this;
        }
    }

    @Override
    public String toString() {
        return  "It is a Sequence: " + Arrays.toString(items);
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}


class StringOut {
    private String  store;

    public StringOut() {
        store = "Default";
    }

    public StringOut(String store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return store;
    }
}

public class _2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; ++i) {
            sequence.add(new StringOut());
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
        System.out.println(selector.outer());
    }
}
