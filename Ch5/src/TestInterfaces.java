interface MainInterface {
    void mainMethod();
}
interface SubInterface extends MainInterface { // If we put implements keyword in place of extends,                                               // compiler throws an error.
    String  test = "abc";
    void subMethod();
}
class MainClass implements SubInterface {
    public void mainMethod() {
        System.out.println("Main Interface Method");
    }

    public void subMethod() {
        System.out.println("Sub Interface Method");
    }
}
public class TestInterfaces {
    public static void main(String args[]) {
        MainClass main = new MainClass();
        main.mainMethod();
        main.subMethod();
        System.out.println(main.test.getClass().getName());
    }
}
