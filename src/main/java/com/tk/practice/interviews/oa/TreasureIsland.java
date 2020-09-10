package com.tk.practice.interviews.oa;

import java.util.LinkedList;
import java.util.Queue;

class Point {
    int x, y;
    Point (int x, int y){
        this.x = x;
        this.y = y;
    }
}

// TC: O(row * col)
// SC: O(row * col)
public class TreasureIsland {
    //Use BFS to find the shortest path to any given destination
    public int minSteps(char[][] grid){

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        //queue to keep track of nodes layer by layer
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0,0));

        //top-left corner is already visited
        grid[0][0] = 'D';

        for (int steps = 1; !queue.isEmpty(); steps++) {

            int size = queue.size();
            for ( ; size > 0; size--) {
                Point p = queue.poll();

                // get children in next level, i.e., in four direction-neighbours
                for (int[] dir: directions) {
                    int row = p.x + dir[0];
                    int col = p.y + dir[1];

                    // shouldn't cross the grid and if no obstacle
                    if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] != 'D') {
                        if (grid[row][col] == 'X') {
                            return steps;
                        }
                        grid[row][col] = 'D';
                        queue.add(new Point(row, col));
                    }
                }
            }
        }
        return -1;
    }
}
