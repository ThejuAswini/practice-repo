package com.tk.practice.leetcode.topinterviewquestions.easy;

import java.util.*;

class ContainsDuplicateII {
    public boolean containsDuplicateII(int[] nums, int k) {
        //edge conditions
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }

        //Hash Set for checking duplicates
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

}
