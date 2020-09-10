package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Test;

class RemoveElementTest {
    RemoveElement testObj = new RemoveElement();

    @Test
    void removeElement() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        testObj.removeElement(nums, val);
    }
}