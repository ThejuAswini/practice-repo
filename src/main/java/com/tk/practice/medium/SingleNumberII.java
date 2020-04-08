package com.tk.practice.medium;

/* 137. Single Number II
Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? */

import java.util.HashMap;
import java.util.NoSuchElementException;

public class SingleNumberII {

    public int singleNumber(int[] nums) {

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

        for (int key: hashMap.keySet()){
            if (hashMap.get(key) == 1){
                return key;
            }
        }

        return 0;
    }
}
