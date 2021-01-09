package com.tk.practice.leetcode.amzn.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        //edge cases
        if (nums == null || nums.length == 0) return result;

        //sort the given array
        Arrays.sort(nums);

        //pointers
        int left = 0;
        int twoSum = 0;
        int currLeft = 0;
        int currRight = 0;
        int currSum = 0;

        //traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // to avoid duplicates
            //for example: [0,0,0]
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }

            left = i + 1;
            int right = nums.length - 1;
            twoSum = -nums[i];

            //loop through remaining elements
            while (left < right) {
                currLeft = nums[left];
                currRight = nums[right];
                currSum = currLeft + currRight;

                if (currSum == twoSum) {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[i], currLeft, currRight)));
                    //for example: [-2,0,0,2,2] --> (0,2) repeats again
                    //so to avoid duplicates in the output;
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if (currSum < twoSum) {
                    //increase the currSum
                    left++;
                }
                else {
                    //decrease the currSum
                    right--;
                }
            }

        }
        return result;
    }
}
