package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Test;

class TwoNumGCDTest {

    TwoNumGCD testObj = new TwoNumGCD();

    @Test
    void twoNumGCD() {

        System.out.println(testObj.twoNumGCD(12, 30)); // gcd: 6
        System.out.println(testObj.twoNumGCD(30, 250)); // gcd: 10
        System.out.println(testObj.twoNumGCD(55, 121)); //gcd: 11
        System.out.println(testObj.twoNumGCD(216, 594)); // gcd: 54

    }

    @Test
    void twoNumberGCDRecursive() {

        System.out.println(testObj.twoNumberGCDRecursive(12, 30)); // gcd: 6
        System.out.println(testObj.twoNumberGCDRecursive(30, 250)); // gcd: 10
        System.out.println(testObj.twoNumberGCDRecursive(55, 121)); //gcd: 11
        System.out.println(testObj.twoNumberGCDRecursive(216, 594)); // gcd: 54

    }
}