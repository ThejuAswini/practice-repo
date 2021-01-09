package com.tk.practice.leetcode.medium;

import java.util.ArrayList;

public class LinkedListRandomNode {
    ArrayList<Integer> arr = new ArrayList<>();

    public LinkedListRandomNode(ListNode head) {
        while(head != null) {
            arr.add(head.val);
            head = head.next;
        }
    }

    // Returns a random node's value
    public int getRandom() {
        return arr.get((int)(Math.random() * arr.size()));
    }
}
