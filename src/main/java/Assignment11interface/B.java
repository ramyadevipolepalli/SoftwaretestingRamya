package Assignment11interface;


public class B implements A {
    @Override
    public void m1() {
        System.out.println("abcd");
    }

    @Override
    public void m2() {
        System.out.println("ghjd");
    }

    @Override
    public void Sum() {
        System.out.println(a+b);
    }
    public static void main(String[] args){
        B obj = new B();
        obj.m1();
        obj.m2();
        obj.Sum();
    }
}

