package com.tk.practice.leetcode.easy;

import java.util.*;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums == null){
            throw new NullPointerException("The int array cannot be null");
        }
        else if(nums.length == 0){
            throw new NoSuchElementException("Array is empty");
        }

        Set<Integer> set = new HashSet<>();

        for (int num:nums){
            if (set.isEmpty()){
                set.add(num);
            }
            else{
                if(set.contains(num)){
                    set.remove(num);
                }
                else {
                    set.add(num);
                }
            }
        }

        return set.iterator().next();
    }
}
