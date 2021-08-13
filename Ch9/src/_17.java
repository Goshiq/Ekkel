interface TestIn {
    int I_AM_A_VARIABLE = 125;
}

interface Keke extends TestIn {
}

class SubClass implements TestIn {
    void say() {
        // I_AM_A_VARIABLE = 12; // does not work
        System.out.println(I_AM_A_VARIABLE); // means static
    }

}

public class _17 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.say();
    }
}
