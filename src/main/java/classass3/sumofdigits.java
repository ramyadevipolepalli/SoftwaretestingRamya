package classass3;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args){
        int number,Sum=0,remainder;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        number= scan.nextInt();
        while(number>0){
            remainder= number%10;
            Sum= Sum + remainder;
            number = number/10;



        }
        System.out.printf("Sum of the digits is %d", Sum);
    }
}
