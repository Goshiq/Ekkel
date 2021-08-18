public class _5 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rhomboid rhomboid = new Rhomboid();
        Shape shape = (Shape) rhomboid;
        shape.rotate();
        shape = (Shape) circle;
        shape.rotate();
    }
}
