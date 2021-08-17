import java.lang.reflect.Array;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

class CollectionSequence<E> implements Collection {
    private Set<E> store = new HashSet<>();
    private int size = 0;

    @Override
    public Object[] toArray(IntFunction generator) {
        return Collection.super.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return Collection.super.removeIf(filter);
    }

    @Override
    public Spliterator spliterator() {
        return Collection.super.spliterator();
    }

    @Override
    public Stream stream() {
        return Collection.super.stream();
    }

    @Override
    public Stream parallelStream() {
        return Collection.super.parallelStream();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        E e = (E)o;
        return store.contains(e);
    }

    @Override
    public Iterator iterator() {
        return store.iterator();
    }

    @Override
    public Object[] toArray() {
        return store.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return Arrays.stream(a).toArray();
    }

    @Override
    public boolean add(Object o) {
        return store.add((E)o);
    }

    @Override
    public boolean remove(Object o) {
        return store.remove((E)o);
    }

    @Override
    public boolean containsAll(Collection c) {
        return store.containsAll(c);
    }

    @Override
    public boolean addAll(Collection c) {
        return store.addAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return store.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return retainAll(c);
    }

    @Override
    public void clear() {
        store.clear();
    }
}

public class _30 {
}
