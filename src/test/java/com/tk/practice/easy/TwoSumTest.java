package com.tk.practice.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum testObj = new TwoSum();

    @Test
    void twoSum() {
        int[] a = {6, 11, 15, 7, 2};
        int[] expected = {3,4};

        Assertions.assertArrayEquals(expected, testObj.twoSum(a, 9));


    }
}