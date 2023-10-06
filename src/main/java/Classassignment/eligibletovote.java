package Classassignment;

import java.util.Scanner;

public class eligibletovote {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        age = input.nextInt();
        input.close();

        if (age >= 18)
            System.out.println("Person is eligible to vote");
        else
            System.out.println("Person is not eligible to vote");
    }
}