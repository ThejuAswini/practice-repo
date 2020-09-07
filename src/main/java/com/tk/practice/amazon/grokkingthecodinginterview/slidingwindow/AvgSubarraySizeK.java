package com.tk.practice.amazon.grokkingthecodinginterview.slidingwindow;

/*
Given an array, find the average of all contiguous subarray of size ‘K’ in it.

Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5

For the first 5 numbers (subarray from index 0-4), the average is: (1+3+2+6-1)/5 => 2.2(1+3+2+6−1)/5=>2.2
The average of next 5 numbers (subarray from index 1-5) is: (3+2+6-1+4)/5 => 2.8(3+2+6−1+4)/5=>2.8
For the next 5 numbers (subarray from index 2-6), the average is: (2+6-1+4+1)/5 => 2.4(2+6−1+4+1)/5=>2.4
…

Output: [2.2, 2.8, 2.4, 3.6, 2.8]

 */

public class AvgSubarraySizeK {
    public double[] findAverages(int[] nums, int k) {

        double[] result = new double[nums.length - k + 1];
        // edge cases
        if (nums == null || nums.length == 0) {
            return result;
        }

        //variable initialization
        int start = 0;
        double sum = 0.0;
        double avg = 0.0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            if (end >= k -1) {
                avg = sum / k;
                result[start] = avg;
                sum = sum - nums[start];
                start++;
            }
        }

        return result;

    }
}
