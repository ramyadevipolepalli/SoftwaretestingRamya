package Classassignment;

import java.util.Scanner;

public class searchstringinstringarray{
    public static void main(String[] args) {
       System.out.println("Enter no.of strings");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[]= new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a string");
            str[i]= sc.next();
        }
        System.out.println("Enter a String to search");
        String sr = sc.next();
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(sr.equalsIgnoreCase(str[i]))
            {
                System.out.println("Found at position:" + (i+1));
                flag=true;
            }
        }
        if(!flag)
            System.out.println("Not in the list");
    }
}
