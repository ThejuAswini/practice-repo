package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    ContainsDuplicate testObj = new ContainsDuplicate();

    @Test
    void containsDuplicate() {

        int[] nums = {2,3,3,2,2};

        Assertions.assertEquals(true, testObj.containsDuplicate(nums));
    }
}