public enum _21 {
    RUBLE,
    DOLLAR,
    KRONA,
    MARKA,
    POUND,
    YIENA,
    UAN,
}

class TestEnum {
    public static void main(String[] args) {
        _21 kek = _21.RUBLE;
        System.out.println(kek + " = " + kek.ordinal());
        System.out.println(_21.KRONA + " = " + _21.KRONA.ordinal());
        switch (kek) {
            case RUBLE: System.out.println("Russia!");
            case KRONA: System.out.println("Sweden!"); break;
            case DOLLAR: System.out.println("USA");
        }

    }
}
