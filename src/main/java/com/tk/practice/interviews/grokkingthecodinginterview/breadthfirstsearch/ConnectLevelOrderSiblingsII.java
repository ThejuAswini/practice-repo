package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

class NodeII {
    private int val;
    private Node left, right, next;

    NodeII() {};

    NodeII(int x) {
        val = x;
        left = right = next = null;
    }
}
public class ConnectLevelOrderSiblingsII {
    public static void connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        Node prev = null;
        Node curr = null;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                curr = queue.poll();

                if (curr != null) {
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                }

                if (prev != null) {
                    prev.next = curr;
                }
                prev = curr;
            }
        }
    }
}
