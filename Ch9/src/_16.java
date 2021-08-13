import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class AdaptedChar implements Readable {
    private static     Random  random = new Random(31);
    private int count = 0;

    public AdaptedChar(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String  result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    char    next() {
        String abc = "1234567890abcdefghijklmnopqrstuxyz";
        return abc.charAt(random.nextInt(abc.length()));
    }
}

public class _16 {
    public static void main(String[] args) {
        AdaptedChar adaptedChar = new AdaptedChar(5);
        Scanner s = new Scanner(adaptedChar);
        while (s.hasNext()) {
            System.out.println(s.next() + " ");
        }
    }
}
