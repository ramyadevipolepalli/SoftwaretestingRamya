package Hashmapassign14;

import java.util.HashMap;
import java.util.Map;

public class Hashmapemployee {
    public static void main(String[] args){
        HashMap<Integer,String> emp = new HashMap<Integer,String>();
        emp.put(101,"DAVID");
        emp.put(102,"SCOTT");
        emp.put(103,"JOHN");
        for(Map.Entry m:emp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
            emp.remove(101);
            System.out.println("After removing"+ emp);
        }
    }
}
