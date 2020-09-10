package com.tk.practice.leetcode;

import com.tk.practice.leetcode.medium.KthLargestElement;
import org.junit.jupiter.api.Test;

class KthLargestElementTest {

    @Test
    void findKthLargest() {
        KthLargestElement testObj = new KthLargestElement();
        int[] nums = {2, 1};
        System.out.println(testObj.findKthLargest(nums, 2));
    }
}