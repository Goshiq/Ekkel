class NewException extends Exception {
    private int o;

    public NewException() {
        o = 99;
    }

    public NewException(int o) {
        this.o = o;
    }

    public void show() {
        System.err.println("O = " + o);
    }
}

class MyException2 extends Exception {
    String string;

    public MyException2(String message, String string) {
        super(message);
        this.string = string;
    }
}

public class _6 {
    public static void main(String[] args) {
        try {
            throw new NewException(5);
        }
        catch (NewException e) {
            e.show();
        }
        try {
            throw new MyException2("A message", "A string");
        }
        catch (MyException2 e) {
            e.printStackTrace();
        }
    }
}
