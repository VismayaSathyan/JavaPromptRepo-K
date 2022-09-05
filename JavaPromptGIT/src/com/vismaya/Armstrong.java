//8. To find Armstrong Number between two given number
package com.vismaya;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = in.nextInt();
//        int ogNumber = number;
//        int remainder;
//        int result = 0;
//        while (ogNumber != 0){
//            remainder = ogNumber % 10;
//            result += Math.pow(remainder, 3);
//            ogNumber /= 10;
//        }
//        if(number == result)
//        System.out.println("Is an Armstrong Number");
//        else
//            System.out.println("Not an Armstrong number");
        armstrong(100, 999);

    }

    public static void armstrong(int start, int end) {
        int remainder;
        int result = 0;
        int n;
        for (int i = start; i <= end; i++) {
            n = i;
            while (n > 0) {
                remainder = n % 10;
                result += Math.pow(remainder, 3);
                n /= 10;
            }
            if (result == i)
                System.out.println(i);
            result = 0;
        }
    }
}
