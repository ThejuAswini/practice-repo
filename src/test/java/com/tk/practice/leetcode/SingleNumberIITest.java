package com.tk.practice.leetcode;

import com.tk.practice.leetcode.medium.SingleNumberII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class SingleNumberIITest {

    SingleNumberII testObj = new SingleNumberII();

    @Test
    void singleNumber_HappyPath() {
        int[] num = {2, 2, 1, 1, 3, 1, 3, 3, 2, 4};

        int result = testObj.singleNumber(num);

        Assertions.assertEquals(4, result);
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