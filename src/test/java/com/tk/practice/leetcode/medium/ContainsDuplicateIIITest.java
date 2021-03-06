package com.tk.practice.leetcode.medium;

import com.tk.practice.leetcode.medium.ContainsDuplicateIII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIIITest {

    ContainsDuplicateIII testObj = new ContainsDuplicateIII();

    @Test
    void containsNearbyAlmostDuplicate() {
        int[] nums = {-1, 2147483647};

        assertFalse(testObj.containsNearbyAlmostDuplicate(nums, 1, 2147483647));
    }
}