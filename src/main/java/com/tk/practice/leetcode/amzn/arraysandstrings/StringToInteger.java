package com.tk.practice.leetcode.amzn.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToInteger {
    public int myAtoi(String str) {
        //edge cases
        if (str == null || str.length() == 0) {
            return 0;
        }

        List<String> wordsInStr = new ArrayList<>();

        if (str.trim().length() == 0) {
            return 0;
        }

        wordsInStr = Arrays.asList(str.trim().split(" "));

        char c = wordsInStr.get(0).charAt(0);
        if (Character.isDigit(c)) {
            return convert(wordsInStr.get(0));
        }
        else if (c == '+' || c == '-') {
            return convertSign(wordsInStr.get(0));
        }
        else{
            return 0;
        }
    }

    public int convert(String str) {
        float num = Float.parseFloat(str);

        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        else if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int)num;
        //return (int)Float.parseFloat(str);
    }

    public int convertSign(String str) {
        if (str.length() == 1) {
            return 0;
        }
        if (Character.isDigit(str.charAt(1))) {
            return convert(str);
        }else {
            return 0;
        }
    }
}
