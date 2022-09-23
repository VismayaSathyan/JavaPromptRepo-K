package com.vismaya.ArraySearch;

public class LinearSearchMain {
    public static void main(String[] args) {
        int[] arr = {};
        int item  = 9;
        int ans = linearSearch(arr, item);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int item){

        if(arr.length == 0){
            System.out.print("The array is empty so: ");
            return -1;
        }
        for(int i=0; i<arr.length; i++) {
            int element = arr[i];
            if (element == item) {
                return i;
            }
        }

        return -1;
    }
}
