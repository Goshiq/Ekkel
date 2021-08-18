import java.io.FileInputStream;
import java.io.IOException;

public class _26 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("foo.txt");
        fileInputStream.close();
    }
}
