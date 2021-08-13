interface First {
    void say();
}

interface Second extends First {
    void sing();
}

interface Third extends First {
    void yell();
}

interface Fourth extends First, Second, Third {
    void run();
}

class Example implements Fourth {
    @Override
    public void say() {
        System.out.println("Say");
    }

    @Override
    public void sing() {
        System.out.println("Sing");
    }

    @Override
    public void yell() {
        System.out.println("Yell");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }
}

public class _13 {
    public static void main(String[] args) {
        Example example = new Example();
        example.say();
        example.sing();
        example.run();
        example.yell();
    }
}
