package com.tk.practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortCharactersByFreqTest {

    SortCharactersByFreq testObj = new SortCharactersByFreq();

    @Test
    void frequencySort() {

        System.out.println(testObj.frequencySort("aabbbccccd"));

    }
}