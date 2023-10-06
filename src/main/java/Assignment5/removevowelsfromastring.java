package Assignment5;

import java.util.Scanner;

public class removevowelsfromastring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S2;
        System.out.println("Enter a String");
        S2 = scan.nextLine();
        String S1 = S2.toLowerCase();
        S1 = S1.replace("a", "").replace("e","");
        S1 = S1.replace("i", "").replace("o","");
        S1 = S1.replace("u", "");

        System.out.println(S1);
    }
}
