package Classassignment;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args){
        int num,remainder;

        System.out.println("Enter number");
        Scanner number = new Scanner(System.in);
        num = number.nextInt();
        number.close();

        remainder = num % 2;

            if(remainder==0)

                System.out.println("num is even");
        else
            System.out.println("num is odd");
    }
}
