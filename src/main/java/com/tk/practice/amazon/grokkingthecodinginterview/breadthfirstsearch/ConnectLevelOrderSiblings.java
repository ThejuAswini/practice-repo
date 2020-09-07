package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a binary tree, connect each node with its level order successor. The last node of each level should point to a null node.
 */
class Node {
    int val;
    Node left, right, next;
    Node(){};
    Node(int x) {
        val = x;
        left = right = next = null;
    }

    //level order traversal using 'next' pointer
    void printLevelOrder() {
        Node nextLevelRoot = this;
        while (nextLevelRoot != null) {
            Node current = nextLevelRoot;
            nextLevelRoot = null;
            while (current != null) {
                System.out.print(current.val + " ");
                if (nextLevelRoot == null) {
                    if (current.left != null)
                        nextLevelRoot = current.left;
                    else if (current.right != null)
                        nextLevelRoot = current.right;
                }
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class ConnectLevelOrderSiblings {
    public static void connect(Node root) {
        // TODO: Write your code here

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);


        while(!queue.isEmpty()) {
            Node curr = new Node();
            Node prev = null;
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
