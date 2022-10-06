package com.vismaya.searchLinear;

public class EvenNoOfDigitsLeet {
    public static void main(String[] args) {
        int[] nums = {2, 345, 6789, 765, 34, 123456};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] arr){
       int count = 0;
        for (int nums : arr){
            if(even(nums)){
                count ++;
            }
        }
        return count;
    }

    static boolean even(int nums) {
        int numberOfDigits = digits1(nums);
        return numberOfDigits % 2 == 0;
    }
    static int digits1(int nums){
        if(nums<0){
            nums *= -1;
        }
        return (int)(Math.log10(nums)) +1;
    }
    static int digits(int nums){
        int count = 0;
        while (nums>0){
            count ++;
            nums /= 10;
        }
        return count;
    }
}
