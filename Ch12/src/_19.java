public class _19 {
    public static void main(String[] args) {
        try {
            try {
                LostException.f();
            }
            finally {
                try {
                    LostException.g();
                }
                catch (SecondException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
