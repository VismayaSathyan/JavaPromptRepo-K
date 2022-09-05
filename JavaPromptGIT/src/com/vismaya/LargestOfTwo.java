//4. Take 2 numbers as input and print the largest number.

package com.vismaya;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int number1 = in.nextInt();
        System.out.print("Enter number two: ");
        int number2 = in.nextInt();
        int max = number1 > number2 ? number1: number2;
        System.out.println("The largest number of two is: " +max);
    }
}
