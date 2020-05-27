package com.tk.practice.medium;

import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {

    @Test
    void oddEvenList() {
        OddEvenLinkedList testObj = new OddEvenLinkedList();

        ListNode head = testObj.oddEvenList(sampleData());

        ListNode tail = head;
        while(tail != null){
            System.out.println(tail.val);
            tail = tail.next;
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