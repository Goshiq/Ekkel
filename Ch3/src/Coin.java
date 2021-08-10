import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        int coin = new Random().nextInt(2);
        if (coin == 0)
            System.out.println("OREL");
        else
            System.out.println("RESHKA");
        System.out.println(coin);
    }
}
