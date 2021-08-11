class Base {
    Base() {
        System.out.println("Default Base constructor with ");
    }

    Base(int i) {
        System.out.println("Base constructor with " + i);
    }
}

class Child extends Base {
    Child(int i) {
        super(i);
        System.out.println("Child constructor with " + i);
    }

    public Child(){
        System.out.println("Default child constructor");
    }
}
public class _8 {
    public static void main(String[] args) {
        Child child = new Child(5);
    }
}
