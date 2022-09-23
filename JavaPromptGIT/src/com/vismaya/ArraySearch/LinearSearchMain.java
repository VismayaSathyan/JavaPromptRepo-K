package com.vismaya.ArraySearch;

public class LinearSearchMain {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,0,-1, 2, 5};
        int item  = 1000;
         linearSearch(arr, item);
        //System.out.println(ans);
    }
    static boolean linearSearch(int[] arr, int item){

        if(arr.length == 0){
            System.out.print("The array is empty");
            return false;
        }
        for(int i=0; i<arr.length; i++) {
            int element = arr[i];
            if (element == item) {
                System.out.println("item is found at index: " +i);
                return true;
            }
        }
        System.out.println("Item is not found");
        return false;
    }
}
