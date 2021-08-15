import java.util.ArrayList;
import java.util.List;

class Gerbil {
    int gerbilNumber;

    public Gerbil() {
    }

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        System.out.println("Gerbil #" + gerbilNumber);
    }
}

public class _1 {
    public static void main(String[] args) {
        List<Gerbil> example = new ArrayList<Gerbil>();
        example.add(new Gerbil());
        for (int i = 0; i < 10; ++i) {
            example.add(new Gerbil(i ^ 5));
        }
        for (Gerbil g: example) {
            g.hop();
        }
    }
}
