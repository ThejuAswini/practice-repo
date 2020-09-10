package com.tk.practice.leetcode;

import com.tk.practice.leetcode.medium.SortCharactersByFreq;
import org.junit.jupiter.api.Test;

class SortCharactersByFreqTest {

    SortCharactersByFreq testObj = new SortCharactersByFreq();

    @Test
    void frequencySort() {

        System.out.println(testObj.frequencySort("aabbbccccd"));

    }
}