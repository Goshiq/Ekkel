import java.lang.reflect.Field;
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
            System.out.println("Methods:");
            for (Field s: Arrays.asList(c.getDeclaredFields())) {
                System.out.println(s);
            }
            if (className.equals("Object")) {
                break;
            }
            System.out.println();
            c = c.getSuperclass();
        }
    }
}
