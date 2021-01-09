package com.tk.practice.leetcode.easy;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t){

        /*if (s.length() != t.length()) return false;

        int[] count = new int[255];

        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i: count){
            if (i != 0){
                return false;
            }
        }

        return true;*/

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
