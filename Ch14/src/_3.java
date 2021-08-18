class Shape {
    int color;
    public void rotate() {
        if (!(this instanceof Circle)) {
            System.out.println("Rotating " + this.getClass().getSimpleName());
        }
        else {
            System.out.println("Circle does not rotate!");
        }
    }
}

class Rhomboid extends Shape {}

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
