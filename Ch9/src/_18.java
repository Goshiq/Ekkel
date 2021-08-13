interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a bicycle");
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Unicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a unicycle");
    }
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Riding a tricycle");
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class _18 {
    public static void rideCycle(CycleFactory c) {
        Cycle cycle = c.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideCycle(new BicycleFactory());
        rideCycle(new UnicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
