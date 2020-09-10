package com.tk.practice.leetcode;

import com.tk.practice.leetcode.medium.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters testObj = new LongestSubstringWithoutRepeatingCharacters();

        String s = "bbbbb";

        System.out.println(testObj.lengthOfLongestSubstring(s));
    }
}