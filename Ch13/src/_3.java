import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Formatter;

class Turtle {
    String name;
    Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s moves to (%d:%d)\n", name, x, y);
    }
}

public class _3 {
    public static void main(String[] args) {
        PrintStream outputStream = System.err;
        Turtle mike = new Turtle("Mike", new Formatter(outputStream));
        mike.move(1,2);
        mike.move(45,2999);
    }
}
