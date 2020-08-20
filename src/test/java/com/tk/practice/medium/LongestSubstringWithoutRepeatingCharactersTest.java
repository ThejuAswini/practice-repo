package com.tk.practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters testObj = new LongestSubstringWithoutRepeatingCharacters();

        String s = "bbbbb";

        System.out.println(testObj.lengthOfLongestSubstring(s));
    }
}