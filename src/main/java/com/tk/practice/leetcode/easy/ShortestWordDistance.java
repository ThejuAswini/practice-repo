package com.tk.practice.leetcode.easy;

import java.util.Arrays;

public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        if (words == null || words.length == 0) return 0;

        if (word1 == null || word2 == null) return 0;

        //converting into list to get the index of word1
        int indexWord1 = Arrays.asList(words).indexOf(word1);
        int pointerA = indexWord1 - 1;
        int pointerB = indexWord1 + 1;
        int countA = 1;
        int countB = 1;

        while (pointerA > 0 && pointerB < words.length && pointerA != pointerB) {
            if (words[pointerA] != word2) {
                if (pointerA > 0) {
                    pointerA--;
                }
                countA++;
            }

            if (words[pointerB] != word2) {
                if (pointerB < words.length - 1) {
                    pointerB++;
                }
                countB++;
            }
        }
        return Math.min(countA, countB);
    }
}
