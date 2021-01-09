package com.tk.practice.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayIITest {
    RemoveDuplicatesFromSortedArrayII testObj = new RemoveDuplicatesFromSortedArrayII();

    @Test
    void removeDuplicates() {
        int[] nums = {1,1,1,2,2,3,3,3,3,3,4,4,4,5,5,6,7,7,7,7,7};
        int expected = 13;
        int actual = testObj.removeDuplicates(nums);
        assertEquals(expected,actual);

        //print output array
        for (int i = 0; i < actual; i++) {
            if (i != actual - 1) {
                System.out.print(" " + nums[i] + ',');
            }
            else {
                System.out.print(" " + nums[i]);
            }
        }
    }
}