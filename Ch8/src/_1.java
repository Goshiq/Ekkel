class Cycle {
    public void ride() {
        System.out.println("Riding Cycle with " + wheels() + " wheels");
    }

    int wheels() {
        return 0;
    }
}

class Bicycle extends Cycle{
    @Override
    public void ride() {
        System.out.println("Riding Cycle with " + wheels() + " wheels");
    }

    @Override
    int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle{
    @Override
    public void ride() {
        System.out.println("Riding Cycle with " + wheels() + " wheels");
    }

    @Override
    int wheels() {
        return 3;
    }
}

class Unicycle extends Cycle{
    @Override
    public void ride() {
        System.out.println("Riding Cycle with " + wheels() + " wheels");
    }

    @Override
    int wheels() {
        return 1;
    }
}

public class _1 {
    public static void Show(Cycle c) {
        c.ride();
        c.wheels();
    }

    public static void main(String[] args) {
        Show(new Cycle());
        Show(new Unicycle());
        Show(new Bicycle());
        Show(new Tricycle());
    }
}
