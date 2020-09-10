package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateIITest {

    ContainsDuplicateII testObj = new ContainsDuplicateII();

    @Test
    void containsNearbyDuplicate() {
        int nums[] = {1,2,3,1};

        Assertions.assertEquals(true, testObj.containsNearbyDuplicate(nums, 3));
    }
}