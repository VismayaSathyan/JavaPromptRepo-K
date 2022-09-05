//Write a program to print whether a number is even or odd, also take input from the user.
package com.vismaya;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
//        if(number % 2 == 0)
//            System.out.println("Even");
//        else
//        System.out.println("Odd");
        String result = (number % 2) == 0 ? "Even":"Odd";
        System.out.println(result);
    }
}
