class Component1 {
    public Component1(int i) {
        System.out.println("Component1 default constructor" + i);
    }

    public void dispose() {
        System.out.println("Deleting component1");
    }
}

class Component3 {
    public Component3(int i) {
        System.out.println("Component3 default constructor" + i);
    }
    public void dispose() {
        System.out.println("Deleting component3");
    }
}

class Component2 {
    public Component2(int i) {
        System.out.println("Component2 default constructor" + i);
    }
    public void dispose() {
        System.out.println("Deleting component2");
    }
}

class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Root(int i) {
        System.out.println("Root default constructor" + i);
        component1 = new Component1(i + 1);
        component2 = new Component2(i + 2);
        component3 = new Component3(i + 3);
    }

    public void dispose() {
        System.out.println("Deleting Root");
        component3.dispose();
        component2.dispose();
        component1.dispose();
    }
}

class Stem extends Root {
    Stem(int i) {
        super(i);
        System.out.println("Stem default constructor" + i);
    }

    public void dispose() {
        System.out.println("Deleting Stem");
        super.dispose();
    }
}
public class _9 {
    public static void main(String[] args) {
        Stem stem = new Stem(3);
        try {
            System.out.println("Main body");
        }
        finally {
            stem.dispose();
        }
    }
}
