import java.io.*;

class MyClass implements Serializable {
    private static int count = 0;
    private final int id = count++;
    private String name;

    public MyClass(String str) {
        name = str;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [id: " + id + "; Name: " + name + "]";
    }

    public String getName() {
        return name;
    }
}

public class _27 {
    public static void main(String[] args) {
        try {
            MyClass myClass = new MyClass("Your name");
            MyClass myClass2 = new MyClass("My name");
            System.out.println(myClass);
            System.out.println(myClass2);

            // writing
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.out"));
            out.writeObject("The first file:");
            out.writeObject(myClass);
            out.writeObject("The second file:");
            out.writeObject(myClass2);
            out.close();

            // reading
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.out"));
            System.out.println((String)(in.readObject()));
            MyClass temp1 = (MyClass) in.readObject();
            System.out.println(temp1);
            System.out.println((String)(in.readObject()));
            MyClass temp2 = (MyClass) in.readObject();
            System.out.println(temp2);
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
