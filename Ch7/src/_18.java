import java.util.Random;

class Ttt {
    static Random random = new Random();

    final int i = random.nextInt();
    static final int j = random.nextInt(100);
}

public class _18 {
    public static void main(String[] args) {
        Ttt ttt = new Ttt();
        Ttt ttt2 = new Ttt();
        System.out.println(ttt.i);
        System.out.println(ttt.j);
        System.out.println(ttt2.i);
        System.out.println(ttt2.j);
    }
}
