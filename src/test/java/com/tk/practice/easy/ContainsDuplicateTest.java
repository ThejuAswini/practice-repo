package com.tk.practice.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    ContainsDuplicate testObj = new ContainsDuplicate();

    @Test
    void containsDuplicate() {

        int[] nums = {2,3,3,2,2};

        Assertions.assertEquals(true, testObj.containsDuplicate(nums));
    }
}