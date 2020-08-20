package com.tk.practice.easy;

public class GCDOfAnArray {
    public int gcdOfAnArray(int nums[]){
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int result = 0;
        for (int element: nums){
            result = getGCD(result, element);

            if (result == 1){
                return 1;
            }
        }
        return result;
    }

    public static int getGCD(int num1, int num2){
        if (num2 == 0) return num1;

        return getGCD(num2, num1 % num2);
    }
}
