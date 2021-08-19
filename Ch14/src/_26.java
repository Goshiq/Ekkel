interface Instrument {
    void    prepareInstrument();
    void    play();
}

class Wind implements Instrument {
    public void clearSpitValve() {
        System.out.println("Cleaning the valve...");
    }

    @Override
    public void prepareInstrument() {
        clearSpitValve();
    }

    @Override
    public void play() {
        System.out.println("Du-du-du");
    }
}

public class _26 {
    public static void main(String[] args) {
        Instrument instrument = new Wind();
        instrument.play();
        instrument.prepareInstrument();
        if (instrument instanceof Wind) {
            Wind wind = (Wind) instrument;
            wind.clearSpitValve();
        }
    }
}
