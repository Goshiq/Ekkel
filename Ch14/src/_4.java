public class _4 {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();
        Shape shape = (Shape) rhomboid;
        Circle circle;
        if (shape instanceof Circle) {
            circle = (Circle) shape;
        }
    }
}
