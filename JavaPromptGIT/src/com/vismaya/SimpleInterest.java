//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package com.vismaya;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principle Amount: ");
        float principle = in.nextFloat();
        System.out.print("Enter the Rate of Interest: ");
        float rate = in.nextFloat();
        System.out.print("Enter the Time Period in Years: ");
        float time = in.nextFloat();

        float simpleInterest = (principle * rate * time)/100;
        System.out.println("The Simple Interest is: Rs." +simpleInterest);
    }
}
