package Assignment5;

import java.util.Scanner;

public class comparestringsignoewcase {
    public static void main(String[] args) {
        String inputa;
        System.out.println("Enter a String");
        Scanner scan = new Scanner(System.in);
        inputa = scan.next();
        String inputb;
        System.out.println("Enter String to compare");
        Scanner sca = new Scanner(System.in);
        inputb = sca.next();
        System.out.println(inputa.equalsIgnoreCase(inputb));
    }
}
