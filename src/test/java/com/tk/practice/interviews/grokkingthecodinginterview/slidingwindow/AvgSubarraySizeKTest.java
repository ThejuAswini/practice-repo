package com.tk.practice.interviews.grokkingthecodinginterview.slidingwindow;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class AvgSubarraySizeKTest {
    AvgSubarraySizeK testObj = new AvgSubarraySizeK();
    @Test
    void findAverages() {
        int[] nums = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        System.out.println(Arrays.toString(testObj.findAverages(nums, k)));
    }
}