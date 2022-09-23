package com.vismaya.ArraySearch;

public class LinearSearchMain {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,0,-1, 2, 5};
        int item1  = 2;
        int item2 = 7;
        int start = 1;
        int end = 5;
        linearSearch(arr, item1);
        System.out.println(" ");
        System.out.println("In Range " +start+ " to " +end+ " Search");
        indexRangeLinearSearch(start,end, arr, item2);
    }
    static void linearSearch(int[] arr, int item){

        if(arr.length == 0){
            System.out.print("The array is empty");
            //return false;
        }
        for(int element : arr) {
            //int element = arr[i];
            if (element == item) {
                System.out.println("item is found : " +element);
                //return true;
            }
        }
        System.out.println("Item is not found");
        //return false;
    }
    static void indexRangeLinearSearch(int start, int end, int[] arr, int item){
        if(arr.length == 0){
            System.out.print("The array is empty");
            //return false;
        }
        for(int i = start; i<=end; i++){
            //for(int element : arr){
            int element = arr[i];
                if(element == item){
                    System.out.println("Item is found :" +element);
                    System.out.println("item is found at index: " +i);
                    //return true;
                }
            //}
        }
        System.out.println("Item is not found");
       // return false;
    }
}
