import java.util.Arrays;

class Item {
    int id;

    public Item(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item #" + id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        if (this == obj)
            return true;
        if (id == ((Item) obj).id)
            return true;
        return false;
    }
}

public class _19 {
    public static void main(String[] args) {
        Item[] arr1 = new Item[]{new Item(4), new Item(2), new Item(99)};
        Item[] arr2 = new Item[]{new Item(4), new Item(2), new Item(99)};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1, arr2));

        // #20
        Item[][] arr3 = new Item[2][2];
        int iter = 3;
        for (Item[] outer: arr3) {
            for (int i = 0; i < outer.length; ++i) {
                outer[i] = new Item(iter++);
            }
        }
        iter = 3;
        Item[][] arr4 = new Item[2][2];
        for (Item[] outer: arr4) {
            for (int i = 0; i < outer.length; ++i) {
                outer[i] = new Item(iter++);
            }
        }
        System.out.println("Arr3: " + Arrays.deepToString(arr3));
        System.out.println("Arr4: " + Arrays.deepToString(arr4));
        System.out.println(Arrays.deepEquals(arr3, arr4));
    }
}
