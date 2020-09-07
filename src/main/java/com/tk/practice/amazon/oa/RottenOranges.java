package com.tk.practice.amazon.oa;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        //added all the rotten oranges coordinates to the queue
        Queue<int[]> rottenOrangesQueue = new LinkedList<>();
        int freshOranges = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    rottenOrangesQueue.add(new int[] {i, j});
                }
                else if (grid[i][j] == 1){
                    freshOranges++;
                }
            }
        }

        if (rottenOrangesQueue.size() == 0 && freshOranges == 0) {
            return 0;
        }

        if (rottenOrangesQueue.size() == 0) {
            return -1;
        }

        if (freshOranges == 0) {
            return 0;
        }

        int time = 0;
        int[][] directions = {{-1, 0},    // Up
                              {1, 0},      // down
                              {0, -1},     // left
                              {0, 1}};      // right

        while (!rottenOrangesQueue.isEmpty()) {

            if (freshOranges == 0) {
                return time;
            }

            int size = rottenOrangesQueue.size();
            for (int k = 0; k < size; k++) {
                // remove the first element to perform few operations
                // using poll instead of remove to handle NoSuchElementException
                int[] rottenOrange = rottenOrangesQueue.poll();
                int x = rottenOrange[0];
                int y = rottenOrange[1];

                //the rotten orange will contaminate its neighbors
                for (int[] dir: directions){
                    int row = x + dir[0];
                    int col = y + dir[1];

                    if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == 1){
                        grid[row][col] = 2;
                        freshOranges--;
                        rottenOrangesQueue.add(new int[]{row, col});

                    }
                }
            }
            time++;
        }

        return freshOranges == 0 ? time : -1;

    }
}
