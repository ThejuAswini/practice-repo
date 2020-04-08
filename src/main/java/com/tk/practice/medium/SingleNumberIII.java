package com.tk.practice.medium;

import java.util.*;
import java.util.stream.Collectors;

/* 260. Single Number III
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Example:

Input:  [1,2,1,3,2,5]
Output: [3,5]
Note:

The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity? */

public class SingleNumberIII {

    public int[] singleNumber(int[] nums) {

        if (nums == null) {
            throw new NullPointerException("The int array cannot be null");
        } else if (nums.length == 0) {
            throw new NoSuchElementException("Array is empty");
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int key : nums) {
            int value = hashMap.getOrDefault(key, 0) + 1;
            hashMap.put(key, value);
        }

        int[] ints = new int[2];

        int idx = 0;
        for (int key: hashMap.keySet()){
            if (hashMap.get(key) == 1){
                if(idx < 2){
                    ints[idx++] = key;
                }
            }
        }

        return ints;
    }

}
