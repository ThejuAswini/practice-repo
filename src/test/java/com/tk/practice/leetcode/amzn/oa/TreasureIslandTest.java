package com.tk.practice.leetcode.amzn.oa;

import com.tk.practice.leetcode.amzn.TreasureIsland;
import org.junit.jupiter.api.Test;

class TreasureIslandTest {
    TreasureIsland testObj = new TreasureIsland();

    @Test
    void minSteps() {
        char[][] grid = {{'O', 'O', 'O', 'O'}, {'D', 'O', 'D', 'O'}, {'O', 'O', 'O', 'O'}, {'X', 'D', 'D', 'O'}};
        System.out.println(testObj.minSteps(grid));
    }
}