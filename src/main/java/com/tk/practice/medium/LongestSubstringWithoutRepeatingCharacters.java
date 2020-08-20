package com.tk.practice.medium;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) return 0;
        if (s.length() == 1) return 1;

        int N = s.length();
        int begin = 0;
        int end = 0;
        int count = 0;
        int result = 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        while (end < N){
            char c = s.charAt(end);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            if (hashMap.get(c) > 1) count++;
            end++;

            while (count > 0){
                char ch = s.charAt(begin);

                if (hashMap.get(ch) > 1) count --;
                hashMap.put(ch, hashMap.get(ch) - 1);
                begin++;
            }

            result = Math.max(result, end-begin);
        }

        return result;
    }
}
