import java.util.ArrayList;
import java.util.List;

public class _3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try {
            System.out.println(list.get(23));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
