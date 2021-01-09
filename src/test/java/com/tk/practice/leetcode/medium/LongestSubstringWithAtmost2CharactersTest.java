package com.tk.practice.leetcode.medium;

import com.tk.practice.leetcode.medium.LongestSubstringWithAtmost2Characters;
import org.junit.jupiter.api.Test;

class LongestSubstringWithAtmost2CharactersTest {

    @Test
    void lengthOfLongestSubstringTwoDistinct() {
        LongestSubstringWithAtmost2Characters testObj = new LongestSubstringWithAtmost2Characters();
        String s = "ccaacbbb";
        System.out.println(testObj.lengthOfLongestSubstringTwoDistinct(s));
    }
}