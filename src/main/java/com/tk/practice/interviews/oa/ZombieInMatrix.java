package com.tk.practice.interviews.oa;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// tC: O(N) where N = M*N; size of the grid, bfs: O(N) time for each cell and each is visited 4 times -> O(4MN) or O(4N) ~ O(N)
// total: O(N) + O(N) ~ O(N), space complexity: O(N) as worst case, all the cells be zombies then queue would be initialized with all the cells of the grid
public class ZombieInMatrix {
    public int minHours(int rows, int columns, List<List<Integer>> grid) {

        // no grid or empty grid
        if (grid == null || grid.size() == 0) {
            return 0;
        } 

        if (rows == 0) return 0;

        //queue because we are going breadth wise to turn humans to zombies
        Queue<int[]> zombieQueue = new LinkedList<>();
        int humans = 0;

        //adding the original zombies to the queue
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                if (grid.get(i).get(j) == 1){
                    zombieQueue.add(new int[]{i,j});
                }
                else{
                    humans++;
                }
            }
        }

        //if there are no zombies and no humans, return 0 because 0hours to turn humans to zombies
        if (zombieQueue.size() == 0 && humans == 0){
            return 0;
        }
        // if there are no zombies and only humans, return -1
        if (zombieQueue.size() == 0){
            return -1;
        }
        // it takes 0 hours to turn humans to zombies since there are no humans
        if (humans == 0) {
            return 0;
        }

        int time = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; //up, down, left, right

        //loop through the queue until it is empty
        while(!zombieQueue.isEmpty()) {

            if (humans == 0){
                return time;
            }

            int size = zombieQueue.size();
            for(int k = 0; k < size; k++){
                int[] zombie = zombieQueue.poll();
                int x = zombie[0];
                int y = zombie[1];

                for (int[] dir: directions) {
                    int row = x + dir[0];
                    int col = y + dir[1];

                    if (row >= 0 && row < rows && col >=0 && col < columns && grid.get(row).get(col) == 0){
                        grid.get(row).set(col,1); //turning human to zombie
                        humans--; //human count reduces
                        zombieQueue.offer(new int[]{row,col}); //add the new zombie to the queue for further processing
                    }
                }

            }
            time++;
        }
        return humans == 0 ? time : -1;
    }
}
