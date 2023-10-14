package Assignment13;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class Arraylistreverse {
    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<String>();
        num.add("23");
        num.add("32");
        num.add("41");
        num.add("14");
        num.add("5");
            ArrayList<String> newnumbers = reverse(num);
        System.out.println(newnumbers);

    }
    public static ArrayList<String> reverse(ArrayList<String> num){
        ArrayList<String> rev = new ArrayList<String>();
        for (int i=num.size()-1;i>=0;i--){
            rev.add(num.get(i));

        }

return rev;
    }
}
