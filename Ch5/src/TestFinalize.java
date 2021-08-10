public class TestFinalize {
    int tank;

    public TestFinalize() {
    }

    public TestFinalize(int tank) {
        this.tank = tank;
    }

    public void finalize() {
        if (tank > 0)
            System.out.println("FINALIZE!");
    }

    public static void main(String[] args) {
        TestFinalize test = new TestFinalize();
        new TestFinalize(50);
        System.gc();
    }
}
