package com.tk.practice.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    @Test
    void minWindow() {
        MinimumWindowSubstring testObj = new MinimumWindowSubstring();

        System.out.println(testObj.minWindow("ADOBECODEBANC", "ABC"));
    }
}