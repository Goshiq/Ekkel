import java.util.Iterator;
import java.util.Random;

abstract class Guy {
    String name;
    int id;
    static int  count;

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }

    public Guy(String name) {
        this();
        this.name = name;
    }

    public Guy(){
        name = "NoName";
        id = count++;
    }

    public void doIt() {
        System.out.println("Doing something");
    }
}

class GoodGuy extends Guy {
    public GoodGuy() {
        super();
    }

    @Override
    public void doIt() {
        System.out.println("Does good things!");
    }

    public GoodGuy(String name) {
        super(name);
    }
}

class BadGuy extends Guy {
    public BadGuy() {
        super();
    }

    @Override
    public void doIt() {
        System.out.println("Does bad things o,,0");
    }

    public BadGuy(String name) {
        super(name);
    }
}

class GuyGenerator implements Generator<Guy>, Iterable<Guy> {

    private Class[] types = new Class[]{GoodGuy.class, BadGuy.class};
    Random random = new Random();
    private int size = 0;

    public GuyGenerator() {
    }

    public GuyGenerator(int size) {
        this.size = size;
    }

    public Guy next() {
        try {
            return (Guy)(types[random.nextInt(types.length)].getDeclaredConstructor(null).newInstance());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Guy> iterator() {
        return new Iterator<Guy>() {
            int count = size;
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Guy next() {
                count--;
                return GuyGenerator.this.next();
            }
        };
    }
}

public class _8 {
    public static void main(String[] args) {
        for (Guy g: new GuyGenerator(5)) {
            g.doIt();
        }
    }
}
