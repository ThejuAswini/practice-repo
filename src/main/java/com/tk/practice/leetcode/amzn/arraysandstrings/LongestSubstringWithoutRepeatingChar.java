package com.tk.practice.leetcode.amzn.arraysandstrings;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {
    public int findLengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int start = 0;
        int result = 0;
        int count = 1;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            }
            else {
                hashMap.put(c, hashMap.get(c) + 1);
                count++;
            }

            while (count > 1) {
                char ch = s.charAt(start);
                if (hashMap.get(ch) == 1) {
                    hashMap.remove(ch);
                }
                else {
                    hashMap.put(ch, hashMap.get(ch) - 1);
                    count--;
                }
                start++;
            }

            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}
