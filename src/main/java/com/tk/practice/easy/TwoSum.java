package com.tk.practice.easy;

import java.util.Hashtable;

// LeetCode pblm# 1
public class TwoSum {

    /*public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            for (int j = i+1; j < nums.length; j++){
                if (temp == nums[j]){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;

    } */

    public int[] twoSum(int[] nums, int target){
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            hashtable.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];

            if(hashtable.containsKey(target)){
                result[0] = i;
                result[1] = hashtable.get(target);
            }
        }
        return result;
    }
}
