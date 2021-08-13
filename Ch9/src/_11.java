import java.util.Arrays;

interface Processor {
    String  name();
    Object  process(Object o);
}

class Apply {
    public static void process(Processor p, Object o) {
        System.out.println("Using " + p.name());
        System.out.println(p.process(o));
    }
}

abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return (this.getClass().getSimpleName());
    }

    @Override
    public abstract String process(Object o);

    public static void main(String[] args) {
        String s = "Simple It";
        System.out.println("Origin is: " + s);
        Apply.process(new SwapPair(), s);
    }
}

class SwapPair extends StringProcessor {
    @Override
    public String process(Object o) {
        String s = (String)o;
        int len = s.length();
        char[] ans = new char[len];
        if (len % 2 != 0)
            ans[len - 1] = s.charAt(len - 1);
        for (int i = 0; i < (len - 1); i += 2) {
            ans[i] = s.charAt(i + 1);
            ans[i + 1] = s.charAt(i);
        }
        return new String(ans);
    }
}

public class _11 {
}
