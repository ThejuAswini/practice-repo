package com.tk.practice.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int K) {
        int[][] result = new int[K][2];
        List<Integer> distances = new ArrayList<>();

        // find euclidean distance
        for (int[] point: points) {
            distances.add(distance(point));
        }

        Collections.sort(distances);
        int t = 0;

        for(int i = 0; i < points.length; i++){
            if (distance(points[i]) <= distances.get(K - 1)){
                result[t++] = points[i];
            }
        }
        return result;

    }

    public int distance(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
}
