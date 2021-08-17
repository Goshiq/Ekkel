public class _5 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            try {
                if (i < 5) {
                    throw new MyException("Error!");
                }
                break;
            }
            catch (MyException e) {
                e.show();
                i++;
            }
        }
    }
}
