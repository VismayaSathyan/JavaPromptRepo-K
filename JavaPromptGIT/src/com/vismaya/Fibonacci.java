//6. To calculate Fibonacci Series up to n numbers.

package com.vismaya;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        System.out.print(f1 + " "+ f2);
        for (int i=2; i<number; ++i){
            f3 = f1 + f2;
            System.out.print(" "+f3);
            f1 = f2;
            f2 = f3;
        }
        System.out.println(" ");
        System.out.println(" Sum is: " +f3);
    }
}
