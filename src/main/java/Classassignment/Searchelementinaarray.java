package Classassignment;

import java.util.Scanner;

public class Searchelementinaarray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int ele, count = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Enter elements to search");
        ele = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("Item found");


        else
            System.out.println("Item not found");

    }


}




