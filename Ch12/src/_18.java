class FirstException extends Exception {
    @Override
    public String toString() {
        return "The First Exception";
    }
}

class SecondException extends Exception {
    @Override
    public String toString() {
        return "The Second Exception";
    }
}

class   LostException {
    public static void f() throws FirstException {
        throw new FirstException();
    }

    public static void g() throws SecondException {
        throw new SecondException();
    }
}

public class _18 {
    public static void main(String[] args) {
        try {
            try {
                LostException.f();
            }
            finally {
                try {
                    LostException.g();
                }
                finally {
                    throw new FourException();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
