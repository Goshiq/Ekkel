import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class _20 {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                Class c = Class.forName(args[0]);
                System.out.println("SuperClass is " + c.getSuperclass());
                System.out.println("Methods are:");
                for (Method m: Arrays.asList(c.getMethods())) {
                    System.out.println(m);
                }
                System.out.println("-----");
                System.out.println("Fields are:");
                for (Field f: Arrays.asList(c.getFields())) {
                    System.out.println(f);
                }
                System.out.println("-----");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
