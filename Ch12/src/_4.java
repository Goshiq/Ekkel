class MyException extends Exception {
    private String string;

    public MyException() {
    }

    public MyException(String string) {
        super(string);
        this.string = string;
    }

    public void show() {
        System.err.println(string);
    }
}

public class _4 {
    public static void main(String[] args) {
        try {
            throw new MyException("Heheh");
        }
        catch (MyException e) {
            e.show();
        }
    }
}
