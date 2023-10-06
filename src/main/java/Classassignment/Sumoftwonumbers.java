package Classassignment;

import java.util.Scanner;

public class Sumoftwonumbers {
    public static void main(String[] args){
        int num1,num2,Sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        num1=sc.nextInt();

        System.out.println("Enter Second number");
        num2=sc.nextInt();

        Sum=num1+num2;

        System.out.println(Sum);

    }
}
