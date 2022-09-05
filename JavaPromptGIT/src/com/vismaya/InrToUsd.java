//5. Input currency in rupees and output in USD.

package com.vismaya;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Amount in INR: ");
        float inr = in.nextFloat();
        double USD = inr / 79.79;
        System.out.println("USD = $" +USD);
    }

}
