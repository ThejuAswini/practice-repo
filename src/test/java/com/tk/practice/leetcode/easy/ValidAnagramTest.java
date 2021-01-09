package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram testObj = new ValidAnagram();

    @Test
    void isAnagram() {
        System.out.print(testObj.isAnagram("abc", "cab"));
    }
}