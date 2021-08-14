interface OneMethod {
    void    theMethod();
}

class OneClass implements OneMethod {
    @Override
    public void theMethod() {
        System.out.println("It is a class!");
    }

    OneMethod   omg() {
        class Internal {
            OneMethod   test() {
                return new OneClass();
            }
        }
        Internal    internal = new Internal();
        return internal.test();
    }
}

public class _7 {
    public static void main(String[] args) {
        OneClass oneClass = new OneClass();
        System.out.println(oneClass.omg());
    }
}
