package com.tk.practice.leetcode.amzn;

import java.util.HashMap;

public class FindPairWithGivenSum {
    public int[] findPair(int[] nums, int target){
        int[] result = new int[2];

        if (nums.length == 0 || nums.length == 1) return result;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], i);
        }

        int diff = 0;
        for (int i = 0; i < nums.length; i++){
            diff = target - 30 - nums[i];
            if (hashMap.containsKey(diff)){
                if (hashMap.get(diff) != i){
                    result[0] = i;
                    result[1] = hashMap.get(diff);
                }

            }
        }

        return result;
    }
}
