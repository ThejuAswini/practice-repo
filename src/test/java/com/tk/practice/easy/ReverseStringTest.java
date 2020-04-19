package com.tk.practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString testObj = new ReverseString();

    @Test
    void reverseString() {

        char[] s = {'H','A','N','N','A','H'};

        testObj.reverseString(s);

        System.out.println(s);
    }
}