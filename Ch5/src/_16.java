public class _16 {
    public _16() {
        System.out.println("Default constr");
    }

    public _16(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "aaa";
        array[1] = "bbb";
        array[2] = "ccc";
        array[3] = "ddd";
        array[4] = "eee";
        for (String s: array) {
            System.out.println(s);
        }

        _16[] myarr = new _16[1];
        myarr[0] = new _16();
        System.out.println(myarr[0]);
    }
}
