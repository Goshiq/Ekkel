class Shape {
    public int highlighted = 0;
    public void rotate() {
        if (!(this instanceof Circle)) {
            System.out.println("Rotating " + this.getClass().getSimpleName());
        }
        else {
            System.out.println("Circle does not rotate!");
        }
    }

    @Override
    public String toString() {
        return "It is " + (highlighted == 0 ? "" : "highlighted ") + this.getClass().getSimpleName();
    }
}

class Rhomboid extends Shape {
    public Rhomboid() {
        highlighted = 1;
    }
}

class Circle extends Shape {}

public class _3 {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();
        Circle  circle;
        Shape   shape = (Shape)rhomboid;
        rhomboid = (Rhomboid)shape;
//        circle = (Circle) shape;
    }
}
