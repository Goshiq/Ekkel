public class _6 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rhomboid rhomboid = new Rhomboid();
        Shape shape = (Shape) rhomboid;
        System.out.println(shape);
        shape = (Shape) circle;
        System.out.println(shape);
    }
}
