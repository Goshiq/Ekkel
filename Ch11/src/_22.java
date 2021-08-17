import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class   Store {
    private String string;

    private Integer count;

    public Store(String string) {
        this.string = string;
        count = 1;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void inc() {
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return string.equals(store.string);
    }

    @Override
    public String toString() {
        return string + ": " + count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}

public class _22 {
    public static void main(String[] args) {
        Set<Store> store = new HashSet<>();
        String str ="A new string with some words. And there are a bit of repetitive letters. Let's check this out!" +
                "Here are some random words. A a a aaa";
        for (String s: str.split(" ")) {
            Store temp = new Store(s);
            Iterator<Store> iterator = store.iterator();
            while (iterator.hasNext()) {
                Store tmpStore = iterator.next();
                if (tmpStore.equals(temp)) {
                    System.out.println("YES");
                    tmpStore.inc();
                    break;
                }
            }
            if (!store.contains(temp)) {
                store.add(temp);
            }
        }
        for (Store store1: store) {
            System.out.println(store1);
        }
    }
}
