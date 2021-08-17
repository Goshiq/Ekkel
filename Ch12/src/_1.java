public class _1 {
    public static void main(String[] args) throws Exception{
        try {
            throw new Exception("Heeello");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
    }
}
