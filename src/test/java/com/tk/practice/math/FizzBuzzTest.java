package com.tk.practice.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        FizzBuzz testObj = new FizzBuzz();

        System.out.println(testObj.fizzBuzz(15));
    }
}