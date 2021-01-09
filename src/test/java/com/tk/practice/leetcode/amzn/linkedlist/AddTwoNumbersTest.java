package com.tk.practice.leetcode.amzn.linkedlist;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
    AddTwoNumbers testObj = new AddTwoNumbers();

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode result = testObj.addTwoNumbers(l1,l2);

        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" --> ");
            }
            result = result.next;
        }
    }

    @Test
    void convertLinkedListToNumber() {
    }

    @Test
    void convertNumberToLinkedList() {
    }
}