package com.tk.practice.leetcode.amzn.linkedlist;

public class AddTwoNumbersInPlace {
    public ListNode addTwoNumbersWithCarry(ListNode l1, ListNode l2) {
        ListNode result;
        int carry = 0;
        ListNode head;

        int sum = l1.val + l2.val;
        if (sum > 9) {
            head = new ListNode(sum % 10);
            carry = sum / 10;
        }else {
            head = new ListNode(sum);
        }

        ListNode prev = head;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            sum = l1.val + l2.val + carry;
            carry = 0;
            if (sum > 9) {
                result = new ListNode(sum % 10);
                carry = sum / 10;
            }else {
                result = new ListNode(sum);
            }
            prev.next = result;
            prev = result;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null && l2 == null && carry != 0) {
            prev.next = new ListNode(carry);
        }
        return head;
    }
}
