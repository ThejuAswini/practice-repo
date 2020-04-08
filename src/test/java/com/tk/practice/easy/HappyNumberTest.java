package com.tk.practice.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    private HappyNumber testObj = new HappyNumber();

    @Test
    void isHappy() {

        Assertions.assertEquals(false, testObj.isHappy(999999));
    }
}