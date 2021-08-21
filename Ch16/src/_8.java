public class _8 <T> {
    T[] array;

    public void method() {
        Object[] objects = new Object[5];
        array = (T[])objects;
    }

    public static void main(String[] args) {
        _8 foo = new _8();
        foo.method();
        Object[] objects = new Object[10];
        objects[0] = "ABC";
        objects[1] = 123;
        objects[2] = null;
        objects[3] = new BerylliumSphere();
        for (int i = 0; i < objects.length; ++i) {
            if (objects[i] != null) {
                System.out.println(objects[i].getClass().getSimpleName());
            }
            else {
                System.out.println(objects[i]);
            }
        }
    }
}
