package com.tk.practice.leetcode.medium;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        //edge cases
        if (nums == null || nums.length == 0) return 0;

        int nonDuplicatePointer = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                count++;
            }
            else {
                count = 1;
            }
            if (count < 3) {
                nums[nonDuplicatePointer] = nums[i];
                nonDuplicatePointer++;
            }
        }
        return nonDuplicatePointer;
    }
}
