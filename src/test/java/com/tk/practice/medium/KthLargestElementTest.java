package com.tk.practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementTest {

    @Test
    void findKthLargest() {
        KthLargestElement testObj = new KthLargestElement();
        int[] nums = {2, 1};
        System.out.println(testObj.findKthLargest(nums, 2));
    }
}