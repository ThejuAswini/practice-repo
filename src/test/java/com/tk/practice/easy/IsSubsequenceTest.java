package com.tk.practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void isSubsequence() {
        IsSubsequence testObj = new IsSubsequence();

        System.out.println(testObj.isSubsequence("abc", "ahbgdc"));
    }
}