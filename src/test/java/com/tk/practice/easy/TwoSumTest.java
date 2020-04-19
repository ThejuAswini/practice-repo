package com.tk.practice.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum testObj = new TwoSum();

    @Test
    void twoSum() {
        int[] a = {3, 2, 4};
        int[] expected = {1, 2};

        Assertions.assertArrayEquals(expected, testObj.twoSum(a, 6));

    }
}