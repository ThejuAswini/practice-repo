package com.tk.practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDOfAnArrayTest {
    GCDOfAnArray testObj = new GCDOfAnArray();

    @Test
    void gcdOfAnArray() {
        int nums[] = {2, 4, 6, 8, 16};
        System.out.println(testObj.gcdOfAnArray(nums));
    }

    @Test
    void getGCD() {
    }
}