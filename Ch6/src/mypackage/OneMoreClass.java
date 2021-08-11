package mypackage;

public class OneMoreClass extends TestClass{
    protected void saySomething() {
        super.sayHello();
    }

    public OneMoreClass() {
        System.out.println("It is a default OneMoreClass constructor from the package!");
    }

    public static void main(String[] args) {
        OneMoreClass test = new OneMoreClass();
        test.saySomething();
    }
}
