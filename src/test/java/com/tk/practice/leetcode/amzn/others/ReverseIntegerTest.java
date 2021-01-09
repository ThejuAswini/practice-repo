package com.tk.practice.leetcode.amzn.others;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ReverseIntegerTest {
    ReverseInteger testObj = new ReverseInteger();

    @Test
    void reverse() {
        System.out.println(testObj.reverse(123));
        System.out.println(testObj.reverse(120));
        System.out.println(testObj.reverse(2147483647));
        System.out.println(testObj.reverse(-123));
        System.out.println(testObj.reverse(1563847412));
    }

    @Test
    void getDigits() {
        System.out.println(testObj.getDigits(123));
    }

    @Test
    void getReverse() {
        List<Integer> digits = new ArrayList<>();
        digits.add(3);
        digits.add(2);
        digits.add(1);
        System.out.println(testObj.getReverse(digits));
    }
}