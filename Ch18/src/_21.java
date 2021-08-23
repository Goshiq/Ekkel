import java.io.*;

public class _21 {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            try {
                if ((s = in.readLine()) != null && s.length() != 0) {
                    System.out.println(s.toUpperCase());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
