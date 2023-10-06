package classass3;

import java.io.Console;
import java.util.Scanner;

public class multiplicationoftable {
    public static void main(String[] args){
        int number,multiplier;
        System.out.println("Enter number for multiplication table:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(number + " * "+ i + " = " + (number * i));

}
}
