import java.io.*;

public class _12 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("Ekkel.iml"));
            String s;
            PrintWriter writer = new PrintWriter("outFile.txt");
            int count = 0;
            while ((s = in.readLine()) != null) {
                writer.println(count++ + " " + s);
            }
            writer.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
