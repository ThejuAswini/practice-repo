package com.tk.practice.interviews.grokkingthecodinginterview.slidingwindow;

/*
Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
 */

public class MaxSumSubarraySizeK {
    //Sliding window technique
    public int findMaxSubarray(int[] nums, int k) {
        //edge cases
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int result = 0;
        int start = 0;
        int end = 0;
        int sum = 0;

        while(end < nums.length) {
            if (end - start < k) {
                sum = sum + nums[end];
                result = Math.max(result, sum);
                end++;
            }
            else {
                sum = sum - nums[start];
                start++;
            }

        }

        return result;
    }
}
