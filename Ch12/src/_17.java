class NonFrog {
    private void kva() {
        System.out.println("Kva!");
    }

    public void f(int i) {
        try {
            System.out.println("Hello!");
            if (i == 1) {
                return;
            }
            kva();
            if (i == 2) {
                return;
            }
            kva();
            if (i == 3) {
                return;
            }
            kva();
        }
        finally {
            System.out.println("Bye!");
        }
    }
}

public class _17 {
    public static void main(String[] args) {
        NonFrog nonFrog = new NonFrog();
        for (int i = 0; i < 5; ++i) {
            nonFrog.f(i);
            System.out.println();
        }
    }
}
