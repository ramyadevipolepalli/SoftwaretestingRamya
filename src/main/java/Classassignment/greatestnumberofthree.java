package Classassignment;

import java.util.Scanner;

public class greatestnumberofthree {
    public static void main(String[] args){
        int a,b,c, largest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        a= scanner.nextInt();
        System.out.println("Enter second number");
        b= scanner.nextInt();
        System.out.println("Enter third number");
        c= scanner.nextInt();
        if((a>b) && (a>c))
            largest = a;
        else if ((b>a) && (b>c))
            largest = b;
        else
             largest = c;
        System.out.printf("largest among %d %d and %d is %d",a,b,c,largest);
    }
}
