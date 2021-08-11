import mypackage.OneMoreClass;

public class _4 {
    public static void main(String[] args) {
        OneMoreClass test = new OneMoreClass();
//        test.saySomething(); can't do this because of package modifier
        System.out.println(test.toString());
    }
}
