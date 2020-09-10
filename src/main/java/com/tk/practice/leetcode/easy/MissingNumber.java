package com.tk.practice.leetcode.easy;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int n = nums.length;
        int Sum1 = (n * (n + 1)) / 2;

        int Sum2 = 0;

        for (int i = 0; i < n; i++) {
            Sum2 = Sum2 + nums[i];
        }

        return (Sum1 - Sum2);
    }
}
