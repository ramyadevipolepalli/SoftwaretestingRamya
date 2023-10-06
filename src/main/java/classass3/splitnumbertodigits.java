package classass3;

import java.util.Scanner;

public class splitnumbertodigits {
    public static void main(String[] args){
        int number;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        number= scan.nextInt();
        while(number!=0){
            System.out.println(number%10);
            number=number/10;
        }
    }
}
