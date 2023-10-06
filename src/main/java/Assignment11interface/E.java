package Assignment11interface;

public class E implements C,D {
    @Override
    public void ma() {
        System.out.println("Ramyadhruv");
    }

    @Override
    public void mb() {
        System.out.println("Dhruvramya");
    }

    @Override
    public void mc() {
        System.out.println("Happyrex");
    }

    @Override
    public void md() {
        System.out.println("Rexhappy");
    }

    public static void main(String[] args) {
        E obj = new E();
        obj.ma();
        obj.mb();
        obj.mc();
        obj.md();
    }
}
