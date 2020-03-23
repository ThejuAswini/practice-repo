package com.tk.practice.reversestring;

public class ReverseString {

    public void reverseString(char[] s) {
        if (s == null){
            throw new NullPointerException("The char array cannot be null");
        }

        int n = s.length;

        for(int i = 0; i < n/2; i++){
            char t = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = t;
        }
    }

}
