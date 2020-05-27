package com.tk.practice.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum testObj = new TwoSum();

    @Test
    void twoSum() {
        int[] a = {3, 3, 4};
        int[] expected = {0, 1};

        Assertions.assertArrayEquals(expected, testObj.twoSum(a, 6));

    }
}