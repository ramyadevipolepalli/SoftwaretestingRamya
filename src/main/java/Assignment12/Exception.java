package Assignment12;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value a");
        int a = scan.nextInt();
        System.out.println("Enter a value b");
        int b = scan.nextInt();
        int c;
        try{
            c=a/b;
        }catch (ArithmeticException ae){
            c=1;
        }
        System.out.println(c);
    }
}
