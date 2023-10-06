package Assignment;

import java.util.Scanner;

public class GradeofBusyqaStudents {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Marks::");
        double Marks = scanner.nextDouble();
        if (Marks <= 50){
            System.out.println("Failure");
        }
        else if(Marks > 50 && Marks <= 65){
            System.out.println("Average");
        }
        else {
            System.out.println("Excellent");
        }
    }
}
