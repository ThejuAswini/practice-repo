package com.tk.practice.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberIIITest {

    SingleNumberIII testObj = new SingleNumberIII();

    @Test
    void singleNumber_HappyPath() {
        int[] num = {2, 2, 1, 1, 3, 3, 6, 4};

        int[] result = testObj.singleNumber(num);
        int[] expectedResult = {4, 6};

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    void singleNumber_Null() {

        Assertions.assertThrows(NullPointerException.class, ()->testObj.singleNumber(null));

    }

    @Test
    void singleNumber_EmptyList() {

        int[] nums = { };

        Assertions.assertThrows(NoSuchElementException.class, ()->testObj.singleNumber(nums));

    }
}