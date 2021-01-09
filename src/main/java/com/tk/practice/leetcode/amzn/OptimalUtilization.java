package com.tk.practice.leetcode.amzn;

import java.util.*;
//n^2logn tc
//O(N) sc
public class OptimalUtilization {
    public List<int[]> getPairs(List<int[]> a, List<int[]> b, int target){

        Map<Integer, List<int[]>> map = new HashMap<>();

        for( int[] x : a) {
            for( int[] y : b) {
                int sum = x[1] + y[1];
                if( sum <= target) {
                    if(!map.containsKey(sum)) {
                        map.put(sum, new ArrayList<>());
                    }
                    map.get(sum).add( new int[]{x[0], y[0]});
                }
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        pq.addAll( map.keySet());
        return map.get(pq.poll());
    }
}
