package com.tk.practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    RemoveElement testObj = new RemoveElement();

    @Test
    void removeElement() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        testObj.removeElement(nums, val);
    }
}