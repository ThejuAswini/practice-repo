package com.tk.practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumLessThanKTest {

    TwoSumLessThanK testObj = new TwoSumLessThanK();

    @Test
    void twoSumLessThanK() {
        int[] nums = {10,20, 30};
        //int[] nums1 = {34,23,1,24,75,33,54,8};
        System.out.println(testObj.twoSumLessThanK(nums, 15));
        //System.out.println(testObj.twoSumLessThanK(nums1, 60));
    }
}