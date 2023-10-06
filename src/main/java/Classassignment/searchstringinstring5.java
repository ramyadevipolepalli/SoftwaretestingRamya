package Classassignment;

import java.util.Scanner;

public class searchstringinstring5 {
    public static void main(String[] args){
        String[] strArray = new String[5];
        strArray[0]="banana";
        strArray[1]="apple";
        strArray[2]="cucumber";
        strArray[3]="pear";
        strArray[4]="berries";

        System.out.println("Enter string to search");
        Scanner sc = new Scanner(System.in);
        String sr = sc.next();
        boolean flag = false;
        for(int i=0;i<5;i++){
            if(sr.equalsIgnoreCase(strArray[i]))
            {
                System.out.println("Found at position:" + (i+1));
                flag=true;
            }
        }
        if(!flag)
            System.out.println("Not in the list");



    }
}
