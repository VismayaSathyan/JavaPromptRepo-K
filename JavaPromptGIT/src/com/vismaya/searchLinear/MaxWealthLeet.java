package com.vismaya.searchLinear;

public class MaxWealthLeet {
    public static void main(String[] args) {
    int[][] accounts = {{1,2,3}, {3,4,5}, {1,1,1}, {40, 2, 7}};
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] accounts){
        int max = 0;
        for(int person=0; person< accounts.length; person++) {
            int sum = 0;
            for (int bank = 0; bank < accounts[person].length; bank++) {
                sum += accounts[person][bank];
            }
            if(sum > max ){
                max = sum;
            }
        }

       return max;
    }
}
