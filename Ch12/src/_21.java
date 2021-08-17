class Basic {
    public Basic() throws MyException {
        throw new MyException();
    }
}

class SubClass extends Basic {

    public SubClass() throws MyException {
        try {
            System.out.println("Test exception");
        }
//        catch (MyException e) {
//            System.out.println("Did we found it?");
//        }
        finally {
            System.out.println("We can't catch Basic's MyException here");
        }
    }
}

public class _21 {
    public static void main(String[] args) {
        try {
            SubClass subClass = new SubClass();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
