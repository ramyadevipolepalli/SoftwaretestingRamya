package Assignment5;

import java.util.Scanner;

public class getcharacteratgivenindex {
    public static void main(String[] args) {
        String input;
        int index;
        System.out.println("Enter a String");
        Scanner scan = new Scanner(System.in);
        input = scan.next();
        String name = input;
        System.out.println("Enter index");
        Scanner ind = new Scanner(System.in);
        index = ind.nextInt();
        char ch = name.charAt(index);
        System.out.println(ch);
    }
}

