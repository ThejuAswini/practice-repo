package com.tk.practice.easy;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++){
            for  (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    if ((j - i) <= k){
                        return true;
                    }
                }
            }
        }

        return false;

    }
}
