package com.tk.practice.hard;

import java.util.ArrayList;
import java.util.List;

public class MaximumSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int start = 0;
        int end = k - 1;
        int N = nums.length;
        List<Integer> result = new ArrayList<>();
        while (end < N && start < N){
            int max = nums[start];
            for(int i = start; i <= end; i++){
                max = Math.max(max, nums[i]);
            }
            start++;
            end++;
            result.add(max);
        }
        return result.stream().mapToInt(j -> j).toArray();
    }
}
