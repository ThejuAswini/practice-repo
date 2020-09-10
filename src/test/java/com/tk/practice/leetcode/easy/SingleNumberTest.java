package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.NoSuchElementException;

class SingleNumberTest {

    private SingleNumber testObj = new SingleNumber();

    @Test
    void singleNumber_HappyPath() {
        int[] num = {2, 1, 3, 1, 3, 2, 4};

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

    @Test
    void hashTable(){
        HashMap<Integer, Integer> hash_table = new HashMap<>();
        int[] nums = {2, 1, 3, 1, 3, 2, 4};

        for (int i : nums) {
            int t = hash_table.getOrDefault(i, 0) + 1;
            hash_table.put(i, t);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                System.out.println(i);
            }
        }
        System.out.println(0);
    }


}