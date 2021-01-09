package com.tk.practice.leetcode.topinterviewquestions.easy;

import java.util.HashSet;

//TC: O(N) and SC: O(N)
 class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        //edge conditions
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }

        //Hash Set for checking duplicates
        HashSet<Integer> set = new HashSet<>();

        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            }
            else {
                set.add(num);
            }
        }

        return false;
    }
}
