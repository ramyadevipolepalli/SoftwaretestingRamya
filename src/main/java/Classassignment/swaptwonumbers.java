package Classassignment;

import java.util.Scanner;

public class swaptwonumbers {
    public static void main(String[] args){
    int num1,num2,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number for num1");
       num1= input.nextInt();
        System.out.println("Enter number for num2");
        num2=input.nextInt();

        input.close();

        System.out.printf("Before swapping num1 = %d and num2 = %d\n",num1,num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("After swapping num1 = %d and num2 = %d\n",num1,num2);
    }
}
