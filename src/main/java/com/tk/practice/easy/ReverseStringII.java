package com.tk.practice.easy;

public class ReverseStringII {

    public String reverseStr(String s, int k) {

        return " ";
    }

    // Reverse String
    public void reverseString(String s) {
        char[] charS = s.toCharArray();
        char temp;
        for (int i = 0; i < charS.length/2; i++){
            int j = (charS.length - 1) - i;
            temp = charS[i];
            charS[i] = charS[j];
            charS[j] = temp;
        }
    }

}
