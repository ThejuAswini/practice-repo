package com.tk.practice.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithAtmost2Characters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {

        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int begin = 0; int end = 0; int count = 0; int result = 0;

        while (end < s.length()){
            char c = s.charAt(end);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);

            if (hashMap.get(c) == 1) count++;
            end++;

            while (count > 2){
                char ch = s.charAt(begin);
                if (hashMap.get(ch) == 1) count--;
                hashMap.put(ch, hashMap.get(ch) - 1);
                begin++;

            }

            result = Math.max(result, end - begin);

        }

        return result;

    }
}
