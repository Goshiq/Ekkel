class State {
    public void showState() {
        System.out.println("Default state");
    }
}

class WarState extends State {
    @Override
    public void showState() {
        System.out.println("War state");
    }
}

class PeaceState extends State {
    @Override
    public void showState() {
        System.out.println("Peace state");
    }
}

class StarShip {
    State state = new State();

    public void setWar() {
        state = new WarState();
    }

    public void setPeace() {
        state = new PeaceState();
    }

    public void showState() {
        state.showState();
    }
}

public class _17 {
    public static void main(String[] args) {
        StarShip ship = new StarShip();
        ship.showState();
        ship.setPeace();
        ship.showState();
        ship.setWar();
        ship.showState();
    }
}
