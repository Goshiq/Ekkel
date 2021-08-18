import java.util.ArrayList;
import java.util.List;

public class _27 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
