abstract class Printer {
    abstract void   print();
}

class LaserPrinter extends Printer {
    int i = 55;

    @Override
    void print() {
        System.out.println(i);
    }
}

public class _3 {
    public static void main(String[] args) {
        Printer laserPrinter = new LaserPrinter();
        laserPrinter.print();
    }
}
