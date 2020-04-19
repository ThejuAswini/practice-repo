package com.tk.practice.easy;

import java.util.HashMap;

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
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int temp = target - nums[i];

            if (temp != nums[i]){
                if(hashMap.containsKey(temp)){
                    result[0] = i;
                    result[1] = hashMap.get(temp);
                    break;
                }
            }
            else {

            }

        }
        return result;
    }
}
