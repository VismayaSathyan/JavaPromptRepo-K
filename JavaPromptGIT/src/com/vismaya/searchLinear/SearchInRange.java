package com.vismaya.searchLinear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {};
        int start = 3;
        int end = 6;
        int target = 8;
        System.out.println("Target item " +target+ " is found at index " +searchInRange(arr, start, end, target));
    }
    public static int searchInRange(int[] arr, int start, int end, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=start; index<=end; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
