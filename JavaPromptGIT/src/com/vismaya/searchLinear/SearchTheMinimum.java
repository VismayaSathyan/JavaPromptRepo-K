package com.vismaya.searchLinear;

public class SearchTheMinimum {
    public static void main(String[] args) {
    int[] arr = {4, -1, 89, -100, 56, -234};
        System.out.println(min(arr));
        System.out.println(min1(arr));
    }
    static int min(int[] arr){
        int min = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
               arr[i] = arr[i+1];
               min = arr[i];
            }
        }
        return min;
    }

    static int min1(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]< ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
