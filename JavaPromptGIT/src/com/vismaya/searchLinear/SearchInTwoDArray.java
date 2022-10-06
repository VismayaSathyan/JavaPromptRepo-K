package com.vismaya.searchLinear;

import java.util.Arrays;

public class SearchInTwoDArray {
    public static void main(String[] args) {
    int[][] arr = {{1,2,3},
            {5,8,9,98},
            {6,8,5,54,3}};
    int target = 98;
    int[] ans = searchIn2D(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maxIn2D(arr));
        maximumIn2D(arr);//sol 2 called but not printed
    }
    static int[] searchIn2D(int[][] arr, int target){
        for (int row=0; row< arr.length; row++){
            for(int col=0; col< arr[row].length; col++){
            if(arr[row][col] == target){
                    return new int[]{row, col};
            }
            }
        }
        return new int[]{-1, -1};
    }

    //Searching the maximum number in a 2D array
    static int maxIn2D(int[][] arr){
       int max = arr[0][0];
        for (int row=1; row< arr.length; row++){
            for(int col=1; col< arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    //Solution with for each loop
    static int maximumIn2D(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int [] integer : arr){
            for(int element : integer){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
