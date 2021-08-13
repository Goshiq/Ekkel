import java.util.Random;

interface Game {
    void Throw();
}

interface GameFactory {
    Game getGame();
}

abstract class    ThrowGame implements Game {
    Random  random = new Random();
}

class   Coin extends ThrowGame {
    @Override
    public void Throw() {
        int i = random.nextInt(2);
        switch (i) {
            case 0:
                System.out.println("Reshka!");
                break;
            default:
                System.out.println("Eagle!");
                break;
        }

    }
}

class CoinFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Coin();
    }
}

class Cube  extends ThrowGame {
    @Override
    public void Throw() {
        int i = random.nextInt(6);
        System.out.println("On the cube: " + (i + 1) + "!");
    }
}

class CubeFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Cube();
    }
}

public class _19 {
    public static void play(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        game.Throw();
    }

    public static void main(String[] args) {
        play(new CoinFactory());
        play(new CubeFactory());
    }
}
