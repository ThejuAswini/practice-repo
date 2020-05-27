package com.tk.practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    TopKFrequentElements testObj = new TopKFrequentElements();
    @Test
    void topKFrequent() {
        int[] nums = {1, 3, 3, 4, 5, 3, 4, 4, 6, 5, 4, 6, 7, 7, 7, 7, 7,7 ,7 , 8, 8, 8, 8, 7, 7, 4, 5, 1, 3, 3};

        int[] array = testObj.topKFrequent(nums, 3);

        for (int i: array){
            System.out.println(i);
        }

    }
}