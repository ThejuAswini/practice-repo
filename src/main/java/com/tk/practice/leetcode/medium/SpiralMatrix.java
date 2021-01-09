package com.tk.practice.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        String[] directions = {"LeftToRight", "TopToBottom", "RightToLeft", "BottomToLeft"};

        List<Integer> spiralList = new ArrayList<>();
        int top = 0;
        int down = matrix.length;
        int left = 0;
        int right = matrix[0].length;
        int index = 0;

        return new ArrayList<>();

    }
}
