package com.tk.practice.leetcode.hard;

import org.junit.jupiter.api.Test;

class MaximumSlidingWindowTest {

    @Test
    void maxSlidingWindow() {
        MaximumSlidingWindow testObj = new MaximumSlidingWindow();
        int[] nums = {1, -1};
        int[] result = testObj.maxSlidingWindow(nums, 1);

        for (int i: result){
            System.out.println(i);
        }
    }
}