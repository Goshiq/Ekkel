class FailingConstructor {
    DisposeClass disposeClass;

    public FailingConstructor() throws Exception{
        try {
            disposeClass = new DisposeClass();
            try {
                throw new Exception("Here we are again!");
            }
            finally {
                disposeClass.dispose();
            }
        }
        finally {
            disposeClass = new DisposeClass();
            try {
                System.out.println("Abrakadabra");
            }
            finally {
                disposeClass.dispose();
            }
        }
    }

    public void killInner() {
        disposeClass.dispose();
    }
}

class DisposeClass {
    public DisposeClass() {
        System.out.println("DisposeClass constructor!");
    }

    public void dispose() {
        System.out.println("Disposing!");
    }
}

public class _22 {
    public static void main(String[] args) {
        FailingConstructor failingConstructor;
        try {
            failingConstructor = new FailingConstructor();
            try {
                System.out.println("Some operations");
            }
            finally {
                failingConstructor.killInner();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("It is working!");
        }

    }
}
