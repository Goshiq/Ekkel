class FourException extends Exception {}

class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Top level");
        try {
            System.out.println("Inner try");
            try {
                throw new FourException();
            }
            finally {
                System.out.println("Inner finally...");
            }
        }
        catch (FourException e) {
            System.out.println("We have caught the Exception in inner try");
            throw new RuntimeException();
        }
        finally {
            System.out.println("Outer finally");
        }
    }
}

public class _15 {
}
