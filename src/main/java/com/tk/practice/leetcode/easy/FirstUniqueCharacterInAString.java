package com.tk.practice.leetcode.easy;

/* 387. First Unique Character in a String

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2. */

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            int value = hashMap.getOrDefault(s.charAt(i), 0) + 1;

            hashMap.put(s.charAt(i), value);
        }

        /* To reduce the number of iterations in the for loop, we iterate through the string instead of iterating through the hashmap
        int temp = s.length();
        for (char key: hashMap.keySet()){
            if (hashMap.get(key) == 1){
                if (temp > s.indexOf(key)){
                    temp = s.indexOf(key);
                }
            }
        }

        if (temp == s.length()){
            return -1;
        }
        else return temp; */

        for (int i = 0; i < s.length(); i++){
            if (hashMap.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }

}
