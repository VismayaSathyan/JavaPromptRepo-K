package com.vismaya.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,6,7,8,9,34,67,78,79,80,89,90,98,99,123,234,567,678,789,890};
        int[] arrD = {987,876,765,654,543,322, 321, 312, 231, 222, 211, 9,8, 6, 4, 3, 2, 1};
        int target = 543;
        int ans = orderAgnosticBs(arrD, target);
        System.out.println(ans);
    }
    static int orderAgnosticBs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isASC = arr[start]<arr[end];
        while (start <= end){
            int mid  = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if (isASC){
                if(target<arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
