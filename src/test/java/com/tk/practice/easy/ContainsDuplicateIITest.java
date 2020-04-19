package com.tk.practice.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIITest {

    ContainsDuplicateII testObj = new ContainsDuplicateII();

    @Test
    void containsNearbyDuplicate() {
        int nums[] = {1,2,3,1};

        Assertions.assertEquals(true, testObj.containsNearbyDuplicate(nums, 3));
    }
}