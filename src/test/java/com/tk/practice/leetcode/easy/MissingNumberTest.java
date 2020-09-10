package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MissingNumberTest {

    MissingNumber testObj = new MissingNumber();

    @Test
    void missingNumber() {

        int[] nums = {3, 2, 1};

        Assertions.assertEquals(0, testObj.missingNumber(nums));
    }
}