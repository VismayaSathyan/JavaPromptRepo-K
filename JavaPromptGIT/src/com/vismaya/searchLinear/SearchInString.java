package com.vismaya.searchLinear;

public class SearchInString {
    public static void main(String[] args) {
        System.out.println("Solution 1: " +searchInString("Kunal", 'u'));
        System.out.println("Solution 1 with string length zero: " +searchInString("", 'u'));
        System.out.println("Solution 2: " +searchInString1("Vismaya", 'i'));
    }
    public static boolean searchInString(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    //Using for each
    public static boolean searchInString1(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
