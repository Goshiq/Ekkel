public class _2 {
    public static void main(String[] args) {
        Integer i = 2;
        i = null;
        try {
            i.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
