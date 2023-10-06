package Classassignment;

import java.util.Scanner;

public class negpostzeroinnumber {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        number = input.nextInt();
        input.close();
        if (number>0)
            System.out.printf("%d is a Positive number",number);
        else if(number<0)
            System.out.printf("%d is a negative number",number);
        else System.out.printf("%d is zero",number);


    }

}
