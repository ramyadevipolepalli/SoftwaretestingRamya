package classass3;

import java.util.Scanner;

public class reverseanumber {
    public static void main(String[] args){
        int number;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        number= scan.nextInt();
        int revNumber=0,remainder;

        while(number>0){
            remainder=number%10;
            number=number/10;
            revNumber=(revNumber*10)+remainder;
        }
        System.out.printf("Reverse number is %d",revNumber);
    }
}
