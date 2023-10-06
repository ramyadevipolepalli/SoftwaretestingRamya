package Assignment8;

import Assignment7.Calculation;

public class cal {
    public static void main(String[] args){
        calculation1 CAL = new calculation1();
        System.out.println(CAL.total(34,56));
        System.out.println(CAL.total(22,56,78));
        System.out.println(CAL.total(34.5,78.9));
        System.out.println(CAL.total(45.7,67.8,89.7));
    }
}
