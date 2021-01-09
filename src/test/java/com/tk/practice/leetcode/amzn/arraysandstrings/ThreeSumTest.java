package com.tk.practice.leetcode.amzn.arraysandstrings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ThreeSumTest {
    ThreeSum testObj = new ThreeSum();

    @Test
    void threeSum() {
        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> result = new ArrayList<>();
        result = testObj.threeSum(nums);
        System.out.print(result);
    }
}