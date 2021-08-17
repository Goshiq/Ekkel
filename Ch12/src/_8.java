class Eight {
    public static void show() throws MyException {
        System.out.println("A method!");
        try {
            throw new MyException();
        }
        catch (MyException e) {
            e.printStackTrace();
        }
    }
}

public class _8 {
    public static void main(String[] args) throws MyException {
        Eight.show();
    }
}
