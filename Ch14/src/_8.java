import java.util.*;

public class _8 {
    public static void main(String[] args) {
//        Integer i = 100;
        Map<Object, Object> i = new LinkedHashMap<>();
        Class c = i.getClass();
        String className;
        while (true) {
            className = c.getSimpleName();
            System.out.println(className);
            if (className.equals("Object")) {
                break;
            }
            c = c.getSuperclass();
        }
    }
}
