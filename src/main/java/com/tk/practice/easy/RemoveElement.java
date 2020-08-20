package com.tk.practice.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Problem# 27
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
