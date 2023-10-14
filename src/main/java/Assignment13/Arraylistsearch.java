package Assignment13;

import java.util.ArrayList;

public class Arraylistsearch {
    public static void main(String[] args){
        ArrayList <String> animals = new ArrayList<String>();
        animals.add("ant");
        animals.add("rat");
        animals.add("cat");
        animals.add("lion");
        animals.add("dog");
        String searchelement = "cat";
        for(int i=0;i<animals.size();i++){
            System.out.println(animals.get(i));
            if(searchelement==animals.get(i)){
                System.out.println("\n");
                System.out.println("element is found");
            }
            else {
                System.out.println("element is not found");
            }
        }
    }
}
