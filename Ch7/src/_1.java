class Test {
    String  s;

    @Override
    public String toString() {
        return "Test{" +
                "s='" + s + '\'' +
                '}';
    }

    public String getS() {
        s = "Hello";
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}

class Test2 {
    Test    test;

    @Override
    public String toString() {
//        test = new Test();
        return "Test2{" +
                "test=" + test +
                '}';
    }
}

public class _1 {
    public static void main(String[] args) {
        Test2   test2 = new Test2();

        System.out.println(test2);
    }
}
