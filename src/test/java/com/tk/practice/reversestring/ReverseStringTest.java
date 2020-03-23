package com.tk.practice.reversestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    private ReverseString testObj;

    @BeforeEach
    void init(){
        testObj = new ReverseString();
    }

    @Test
    void reverseString_HappyPath() {

        char[] s0 = {'t', 'h', 'e', 'j', 'a'};
        char[] expectedS0 = {'a', 'j', 'e', 'h', 't'};

        char[] s1 = {'t', 'h', 'e', 'j', 'a', 's'};
        char[] expectedS1 = {'s','a', 'j', 'e', 'h', 't'};

        testObj.reverseString(s0);
        testObj.reverseString(s1);

        Assertions.assertArrayEquals(expectedS0, s0);
        Assertions.assertArrayEquals(expectedS1, s1);
    }

    @Test
    void reverseString_EdgeConditions() {

        char[] s = {};
        char[] expectedS = {};

        testObj.reverseString(s);
        Assertions.assertArrayEquals(expectedS, s);

        Assertions.assertThrows(NullPointerException.class, ()-> testObj.reverseString(null));
    }

}