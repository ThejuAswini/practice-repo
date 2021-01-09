package com.tk.practice.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        List<Integer> list = new LinkedList<>();

        while (x != 0) {
            list.add(0, x % 10);
            x = x / 10;
        }

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
