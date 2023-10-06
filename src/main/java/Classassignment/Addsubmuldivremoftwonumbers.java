package Classassignment;

import java.util.Scanner;

public class Addsubmuldivremoftwonumbers {
    public static void main(String[] args){
        int num1,num2,addition,substract,multiply,divide;
        double remainder;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        num1=sc.nextInt();

        System.out.println("Enter Second number");
        num2=sc.nextInt();

        addition=num1+num2;

        System.out.println(addition);

        substract=num1-num2;
        System.out.println(substract);

        multiply=num1*num2;
        System.out.println(multiply);

        divide=num1/num2;
        System.out.println(divide);

        remainder=num1%num2;
        System.out.println(remainder);

    }
}
