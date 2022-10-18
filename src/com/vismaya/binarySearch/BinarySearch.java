package com.vismaya.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,34,67,78,79,80,89,90,98,99,123,234,567,678,789,890};
        int target = 123;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
//      int mid = start + (end-start)/2; WRONG Put it inside the loop
        while(start<=end){

            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
