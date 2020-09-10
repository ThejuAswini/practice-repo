package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HappyNumberTest {

    private HappyNumber testObj = new HappyNumber();

    @Test
    void isHappy() {

        Assertions.assertEquals(false, testObj.isHappy(999999));
    }
}