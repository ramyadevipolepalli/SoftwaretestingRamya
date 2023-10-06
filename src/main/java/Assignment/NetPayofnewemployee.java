package Assignment;

import java.util.Scanner;

public class NetPayofnewemployee {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Gross Pay");
        double Grosspay = scanner.nextDouble();
        System.out.println("Gross pay is ::" + Grosspay);
double EI = 0.05*Grosspay;
        double FT = 0.08*Grosspay;
        double OT = 0.035*Grosspay;
        double Netpay;
        Netpay = Grosspay - (EI+FT+OT);
        System.out.println(Netpay);





    }
}
