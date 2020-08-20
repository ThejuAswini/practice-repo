package com.tk.practice.easyexplorecard;

public class RemoveDuplicatesInPlace {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int newLen = len;

        if (len == 0) return 0;
        else if (len == 1) return len;
        else{
            for (int i = 1; i < len; i++){
                if (nums[i - 1] == nums[i]){
                    newLen--;
                }
            }
        }

        return newLen;
    }
}
