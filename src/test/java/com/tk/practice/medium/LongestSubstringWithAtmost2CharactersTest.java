package com.tk.practice.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithAtmost2CharactersTest {

    @Test
    void lengthOfLongestSubstringTwoDistinct() {
        LongestSubstringWithAtmost2Characters testObj = new LongestSubstringWithAtmost2Characters();
        String s = "ccaacbbb";
        System.out.println(testObj.lengthOfLongestSubstringTwoDistinct(s));
    }
}