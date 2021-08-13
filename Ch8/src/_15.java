class Main {
    private int   refCount = 0;

    @Override
    public String toString() {
        return "Main " + id;
    }

    public Main() {
        System.out.println("Создаём " + this);
    }

    private static long count = 0;
    private final long id = count++;

    protected void dispose() {
        if (--refCount == 0)
            System.out.println("Уничтожили Main");
    }

    protected void addRef () {
        refCount++;
        System.out.println("Счётчик ссылок: " + refCount);
    }
}

class Example {
    private Main    main;

    public Example(Main main) {
        this.main = main;
        System.out.println("Создали Example");
        main.addRef();
    }

    protected void dispose() {
        System.out.println("Уничтожили Example");
        main.dispose();
    }
}

public class _15 {
    public static void main(String[] args) {
        Main main = new Main();
        Example[] array = new Example[5];
        for (int i = 0; i < 5; ++i) {
            array[i] = new Example(main);
        }
        System.out.println("MAin body");
        for (int i = 4; i >= 0; --i) {
            array[i].dispose();
        }
    }
}
