package com.tk.practice.leetcode.amzn.oa;

import com.tk.practice.leetcode.amzn.RottenOranges;
import org.junit.jupiter.api.Test;

class RottenOrangesTest {
    RottenOranges testObj = new RottenOranges();

    @Test
    void orangesRotting() {
        //int[][] grid = {{2,1,1}, {1,1,0}, {0,1,1}};
        //int[][] grid = {{2,1,1}, {0,1,1}, {1,0,1}};
        //int[][] grid = {{0,1}}; fresh orange is available, so return -1
        //int[][] grid = {{0,2}}; rotten orange is possible but no fresh orange at min 0, the answer is 0
        //int[ ][ ] grid = {{0}}; // No fresh orange, return 0
        int[][] grid = {{2,2,2,2,2}};
        System.out.println(testObj.orangesRotting(grid));
    }
}