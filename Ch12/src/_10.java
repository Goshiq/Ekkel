class First {
    public void f() throws MyException2{
        try {
            g();
        }
        catch (MyException e) {
            e.printStackTrace();
            throw new RuntimeException(new MyException2("Hehe", "Ololo"));
        }
    }

    public void g() throws MyException{
        throw new MyException();
    }
}

public class _10 {
    public static void main(String[] args) {
        First first = new First();
        try {
            first.f();
        } catch (MyException2 e) {
            e.printStackTrace();
        }
    }
}
