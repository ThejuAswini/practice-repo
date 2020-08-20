package com.tk.practice.easyexplorecard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesInPlaceTest {
    RemoveDuplicatesInPlace testObj = new RemoveDuplicatesInPlace();

    @Test
    void removeDuplicates() {

        //int[] nums = {1, 1, 2};
        //int[] nums = {1, 1, 1};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(testObj.removeDuplicates(nums));
    }
}