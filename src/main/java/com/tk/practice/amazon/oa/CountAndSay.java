package com.tk.practice.amazon.oa;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountAndSay {
    public void countAndSay(int n) {




    }

    String resultString(String str){
        //String to Integer
        int num = Integer.parseInt(str); //Integer.toString(num) instead of str
        int[] digits = str.chars().map(t -> t - '0').toArray();

        LinkedHashMap<Integer, Integer> count = new LinkedHashMap<>();

        for (int x: digits){
            int val = count.getOrDefault(x, 0) + 1;
            count.put(x, val);
        }

        String result = "";
        for (int key: count.keySet()){
            result = result + count.get(key).toString() + Integer.toString(key);
        }

        return result;
    }
}
