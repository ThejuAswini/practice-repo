package com.tk.practice.leetcode.medium;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        //edge cases
        if (nums == null || nums.length == 0 || s == 0) {
            return 0;
        }

        int start = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;

        for(int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= s) {
                len = Math.min(len, end - start + 1);

                sum = sum - nums[start];
                start++;
            }
        }
        return len != Integer.MAX_VALUE ? len : 0;
    }
}
