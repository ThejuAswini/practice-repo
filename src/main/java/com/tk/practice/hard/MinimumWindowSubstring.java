package com.tk.practice.hard;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public int minWindow(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        //O(n)
        for (char c: t.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        int start = 0; int end = 0; int count = t.length(); int res = Integer.MAX_VALUE;
        //StringBuilder result = new StringBuilder();
        int N = s.length();

        while (start < N && end < N){
            char c = s.charAt(end);

            if (hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c) - 1);

                if (hashMap.get(c) == 0) count--;
            }
            end++;

            while (count == 0){
                char ch = s.charAt(start);
                if (hashMap.containsKey(ch)){
                    hashMap.put(ch, hashMap.get(ch) + 1);
                    count++;
                }
                start++;
                res = Math.min(res, end - start + 1);
            }

        }

        return res;
    }
}
