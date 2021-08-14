package pack3;
import pack.Interface6;
import pack2.*;

public class RandomClass {
    public Interface6 aMethod() {
        NextOne nextOne = new NextOne();
        return nextOne.new SomeClass();
    }

    public static void main(String[] args) {
        RandomClass randomClass = new RandomClass();
        randomClass.aMethod().simple();
    }
}
