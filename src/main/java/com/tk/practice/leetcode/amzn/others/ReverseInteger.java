package com.tk.practice.leetcode.amzn.others;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
    public int reverse(int x) {
        //edge case
        if (x == 0) {
            return 0;
        }

        List<Integer> digits = getDigits(x);
        int reversedNumber = getReverse(digits);

        return reversedNumber;
    }

    public List<Integer> getDigits(int x) {
        int rem = 0;
        List<Integer> digits = new ArrayList<>();

        while (x != 0) {
            digits.add(x % 10);
            x = x / 10;
        }
        return digits;
    }

    public int getReverse(List<Integer> digits) {
        double sum = 0;
        double product;

        for (int i = digits.size() - 1; i >= 0; i--) {
            int digit = digits.get(i);

            product = digit * Math.pow(10, (digits.size() - 1) - i);

            if (product > Integer.MAX_VALUE || product < Integer.MIN_VALUE || sum + product < Integer.MIN_VALUE || sum + product > Integer.MAX_VALUE) {
                return 0;
            }

            sum += product;
        }

        return (int)sum;
    }
}

/*
if (digit * Math.pow(10, (digits.size() - 1) - i) > Integer.MAX_VALUE) {
                return 0;
            } else if (digit * Math.pow(10, (digits.size() - 1) - i) < Integer.MIN_VALUE) {
                return 0;
            } else if (sum + (digit * Math.pow(10, (digits.size() - 1) - i)) > Integer.MAX_VALUE) {
                return 0;
            } else if (sum + digit * Math.pow(10, (digits.size() - 1) - i) < Integer.MIN_VALUE) {
                return 0;
            } else {
                sum += digit * Math.pow(10, (digits.size() - 1) - i);
            }
 */
