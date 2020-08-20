package com.tk.practice.amazon.oa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {
    CountAndSay testObj = new CountAndSay();

    @Test
    void countAndSay() {
    }

    @Test
    void resultString() {
        //System.out.println(testObj.resultString("11"));
        //System.out.println(testObj.resultString("21"));
        System.out.println(testObj.resultString("1211"));
    }
}