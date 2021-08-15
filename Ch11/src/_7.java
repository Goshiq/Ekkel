import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class   MyClass {
    String str;

    @Override
    public String toString() {
        return str;
    }

    public MyClass() {
        str = new Date().toString();
    }
}

public class _7 {
    public static void main(String[] args) {
        List<MyClass> myList = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            myList.add(new MyClass());
        }
        System.out.println(myList);
        List<MyClass> sub = myList.subList(2, 5);
        System.out.println(sub);
        List<MyClass> copySub = new ArrayList<>(sub);
        myList.removeAll(sub);
        System.out.println(myList);
        System.out.println(copySub);
//        System.out.println(sub);  ERROR - sub removed @28
    }
}
