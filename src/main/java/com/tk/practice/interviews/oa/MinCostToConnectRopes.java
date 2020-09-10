package com.tk.practice.interviews.oa;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinCostToConnectRopes {
    // Time complexity: O(nlogn).
    // Space complexity: O(n).

    public static int minCost(List<Integer> ropes) {
        Queue<Integer> pq = new PriorityQueue<>(ropes);
        int totalCost = 0;
        while (pq.size() > 1) {
            int cost = pq.poll() + pq.poll();
            pq.add(cost);
            totalCost += cost;
        }
        return totalCost;
    }
}
