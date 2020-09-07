package com.tk.practice.amazon.oa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreasureIslandTest {
    TreasureIsland testObj = new TreasureIsland();

    @Test
    void minSteps() {
        char[][] grid = {{'O', 'O', 'O', 'O'}, {'D', 'O', 'D', 'O'}, {'O', 'O', 'O', 'O'}, {'X', 'D', 'D', 'O'}};
        System.out.println(testObj.minSteps(grid));
    }
}