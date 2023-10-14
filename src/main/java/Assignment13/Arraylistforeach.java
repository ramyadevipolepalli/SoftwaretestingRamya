package Assignment13;

import java.util.ArrayList;

public class Arraylistforeach {
    public static void main(String[] args){
        ArrayList al = new ArrayList<>();
        al.add(123);
        al.add("ant");
        al.add(34.67);
        al.add(true);
        for(Object obj:al)
            System.out.println(obj);
    }


}
