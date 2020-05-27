package com.tk.practice.easy;

import java.util.Arrays;

public class TwoSumLessThanK {
    public int twoSumLessThanK(int[] A, int K) {

        if (A.length == 0) return -1;
        Arrays.sort(A);
        int start = 0;
        int end = A.length - 1;
        int temp = -1;

        while(start < end){
            int sum = A[start] + A[end];
            if (sum < K){
                if (temp < sum)
                temp = sum;
                start++;
            }
            else end--;
        }

        if (temp < K) return temp;

        return -1;
    }
}
