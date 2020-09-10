package com.tk.practice.interviews.grokkingthecodinginterview.slidingwindow;

import org.junit.jupiter.api.Test;

class MaxSumSubarraySizeKTest {
    MaxSumSubarraySizeK testObj = new MaxSumSubarraySizeK();

    @Test
    void findMaxSubarray() {
        int[] nums = {2,1,5,1,3,2};
        int k = 3;

        System.out.println(testObj.findMaxSubarray(nums,k));
    }
}