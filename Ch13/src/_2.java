class InfinityRecursion {
    @Override
    public String toString() {
        return "Address is: " + super.toString();
    }
}

public class _2 {
    public static void main(String[] args) {
        InfinityRecursion infinityRecursion = new InfinityRecursion();
        System.out.println(infinityRecursion);
    }
}
