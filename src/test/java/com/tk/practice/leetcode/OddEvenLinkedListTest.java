package com.tk.practice.leetcode;

import com.tk.practice.leetcode.medium.OddEvenLinkedList;
import com.tk.practice.leetcode.medium.ListNode;
import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {

    @Test
    void oddEvenList() {
        OddEvenLinkedList testObj = new OddEvenLinkedList();

        ListNode head = testObj.oddEvenList(sampleData());

        ListNode tail = head;
        while(tail != null){
            System.out.println(tail.getVal());
            tail = tail.getNext();
        }

    }

    ListNode sampleData(){
        //ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        return node1;
    }
}