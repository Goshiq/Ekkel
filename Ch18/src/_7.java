import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _7 {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                BufferedReader in = new BufferedReader(new FileReader(args[0])); // #8
//            BufferedReader in = new BufferedReader(new FileReader("Ekkel.iml")); // #7
                List<String> list = new LinkedList<>();
                String str;
                while ((str = in.readLine()) != null) {
                    list.add(str);
                }
//                Collections.reverse(list); // #7
                for (String s : list) {
//                    System.out.println(s.toUpperCase()); // #9
                    System.out.println(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
