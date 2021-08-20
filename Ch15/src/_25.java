import java.util.ArrayList;
import java.util.List;

interface HasVoice {
    void say();
}

interface HasEyes {
    void blink();
}

class Unit implements HasEyes, HasVoice {
    private static int count = 0;
    private int id = count++;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " ID: " + id;
    }

    @Override
    public void say() {
        System.out.println(getClass().getSimpleName() + " is talking...");
    }

    @Override
    public void blink() {
        System.out.println(getClass().getSimpleName() + " is blinking...");
    }
}

public class _25 { //hate erasure
    public static void example(ArrayList<? extends HasEyes> arrayList) {
        System.out.println(arrayList);
    }

    public static void example2(ArrayList<? extends HasEyes> arrayList) {
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        ArrayList<Unit> list = new ArrayList<>();

        for (int i = 0; i < 5; ++i) {
            list.add(new Unit());
        }
        example(list);
        example2(list);
    }
}
