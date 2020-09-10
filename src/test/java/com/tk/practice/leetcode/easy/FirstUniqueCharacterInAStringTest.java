package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterInAStringTest {

    FirstUniqueCharacterInAString testObj = new FirstUniqueCharacterInAString();

    @Test
    void firstUniqChar() {

        String s = new String("loveleeto");

        Assertions.assertEquals(2, testObj.firstUniqChar(s));

    }
}