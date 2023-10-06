package Classassignment;

public class Printstringarray {
    public static void main(String[] args) {
        String[] strArray = new String[5];
        strArray[0] = "banana";
        strArray[1] = "apple";
        strArray[2] = "cucumber";
        strArray[3] = "pear";
        strArray[4] = "berries";
        for (String fruit:strArray)
            System.out.println(fruit);
    }
}