package com.tk.practice.medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 1 ) return nums[0];
        if (nums.length == 0) return -1;

        Arrays.sort(nums);
        int result;
        int count = 1;

        for (int i = nums.length - 1; i >= 0; i--){
            if (k == count) return nums[i];
            count++;
        }

        return -1;
    }
}
