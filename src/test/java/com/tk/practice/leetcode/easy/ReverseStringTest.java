package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

    ReverseString testObj = new ReverseString();

    @Test
    void reverseString() {

        char[] s = {'H','A','N','N','A','H'};

        testObj.reverseString(s);

        System.out.println(s);
    }
}