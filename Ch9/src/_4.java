abstract class Base {
    abstract void say(); // step2
}

class SubBase extends Base {
    void say() {
        System.out.println("Hello");
    }
}

public class _4 {
//    static void Test (Base base) {
//        SubBase subBase = (SubBase)base;
//        subBase.say();
//    }

    static void Test (Base base) { //step2
        base.say();
    }

    public static void main(String[] args) {
        SubBase test = new SubBase();
        Test((Base)test);
    }
}
