package Assignment5;

import java.util.Scanner;

public class concatinatetwostrings {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter  String1");
        String inputa = scan.nextLine();

        System.out.println("Enter  String2");
        String inputb = scan.nextLine();

        System.out.println(inputa.concat(inputb));


    }
}

