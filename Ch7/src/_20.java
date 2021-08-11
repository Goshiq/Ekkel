class Over20 {
    final void sayIt() {
        System.out.println("I am here!");
    }

    private void    a(String s) {
        System.out.println(s);
    }
}

class EndIt extends Over20 {
//    @Override
//    final void sayIt() {
//        System.out.println("LOL");
//    }
    private void    a(String s) {
        System.out.println(s + "Keke");
    }

    public void     inter(String s) {
        a(s);
    }
}

public class _20 {
    public static void main(String[] args) {
        EndIt   ob = new EndIt();
        ob.inter("Hello!");
    }
}
