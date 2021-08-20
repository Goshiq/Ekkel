class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.getDeclaredConstructor(null).newInstance();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}

public class _14 {
    public static void main(String[] args) {
//        Generator<Coffee> generator = BasicGenerator.create(Coffee.class); // as in book
        Generator<Coffee> generator = new CoffeeGenerator();
        for (int i = 0; i < 5; ++i) {
            System.out.println(generator.next());
        }
    }
}
