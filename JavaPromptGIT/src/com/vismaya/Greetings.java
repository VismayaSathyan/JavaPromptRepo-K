//2. Take name as input and print a greeting message for that particular name.

package com.vismaya;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.nextLine();
        System.out.println("Welcome "+name);
    }
}
