public class _1 {
    public String name;

    public _1() {
    }

    public void awesomeMethod(Speakable unit) {
        unit.say();
    }
}

class Test {
    public static void main(String[] args) {
        _1 kek = new _1();
        System.out.println(kek.name);
        kek.awesomeMethod(new Human());
        kek.awesomeMethod(new Animal());
        Human h1 = new Human("", 1);
        Human h2 = new Human(1, "");
    }
}
