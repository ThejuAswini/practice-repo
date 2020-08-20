package com.tk.practice.easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int prev = 0;
        int current = 0;

        for (char c: s.toCharArray()){
            if (t.contains("c")){
                current = s.indexOf('c');

                if (current < prev) return false;
            }

        }

        return true;
    }
}
