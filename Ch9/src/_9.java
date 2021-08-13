interface Instrumentable {
    void    tune();
    void    adjust();
}

interface Playable {
    void    play();
}

abstract class Instrument implements Instrumentable {

}

class Wind extends Instrument implements Playable{
    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void tune() {
        System.out.println("Tuning " + this);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting " + this);
    }
}

class Percussion extends Instrument implements Playable{
    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void tune() {
        System.out.println("Tuning " + this);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting " + this);
    }
}

public class _9 {
    public static void main(String[] args) {
        Wind wind = new Wind();
        wind.adjust();
        wind.play();
        wind.tune();
    }
}
