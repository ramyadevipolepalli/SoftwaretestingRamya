package classass3;

public class objectarrayprint {
    public static void main(String[] args){
        Object a[] = new Object[5];
        a[0] = "banana";
        a[1] = 23.5;
        a[2] = 5;
        a[3] = true;
        a[4] = 'R';
        for(Object i : a)
            System.out.println(i);

    }
}
