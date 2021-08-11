public class _2 {
    public _2() {
        System.out.println("It is _2's default constructor");
    }

    private String s = "It is a String variable in _2";

    public void showS() {
        System.out.println(s);
    }

    public void appendString(String s) {
        this.s += s;
    }
}

class Tt extends _2 {
    @Override
    public void appendString(String s) {
        super.appendString("Tt's method: " + s);
    }

    public Tt() {
        System.out.println("It is a Tt's default constructor");
    }

    @Override
    public void showS() {
        System.out.println("It is a Tt's ShowS");
        super.showS();
        super.appendString("Kekeke");
        super.showS();
        System.out.println(super.toString());
        System.out.println(this);
    }

    public static void main(String[] args) {
        Tt tt = new Tt();
        tt.showS();
        tt.appendString("Lol");
        tt.showS();
    }
}
