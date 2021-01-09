package com.tk.practice.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordDistanceTest {
    ShortestWordDistance testObj = new ShortestWordDistance();

    @Test
    void shortestDistance() {
        String[] words = {"practice", "makes", "perfect", "coding", "practice"};
        System.out.print(testObj.shortestDistance(words, "coding", "practice"));
    }
}