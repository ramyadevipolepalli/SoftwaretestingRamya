package Assignment12;

public class arrayexception {
public static void main(String[] args){
    try {
        int a[] = null;
        System.out.println(a.length);
    }catch (NullPointerException ne){
        System.out.println(ne);
    }
}
}
