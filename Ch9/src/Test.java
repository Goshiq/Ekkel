abstract class Test {
    void Kek() {
        System.out.println("Kekeke");
    }

    static class Test1 extends Test {
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.Kek();
    }
}