//7. To find out whether the given String is Palindrome or not.
package com.vismaya;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String word = in.nextLine();
        String revWord ="";
        char ch;
        for (int i=0; i<word.length(); i++){
            ch = word.charAt(i);
            revWord = ch + revWord;
        }
        String result = revWord.equals(word) ? "Is Palindrome": "Not a Palindrome";
        System.out.println(result);
    }
}
