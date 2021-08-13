import testPackage.*;

class TestInterface implements testPackage.TestInterface {
    @Override
    public void say() {
        System.out.println("Hello");
    }

    @Override
    public void look() {
        System.out.println("It is looking at");
    }

    @Override
    public void take() {
        System.out.println("It is taking something");
    }
}

public class _5 {
    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        testInterface.look();
        testInterface.say();
        testInterface.take();
    }
}
