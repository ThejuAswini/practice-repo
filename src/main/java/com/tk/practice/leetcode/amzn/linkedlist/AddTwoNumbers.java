package com.tk.practice.leetcode.amzn.linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //edge cases
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        long num1 = convertLinkedListToNumber(l1);
        long num2 = convertLinkedListToNumber(l2);

        long sum = num1 + num2;

        return convertNumberToLinkedList(sum);
    }

    public long convertLinkedListToNumber(ListNode l) {
        long number = 0;
        int i = 0;

        while (l != null) {
            number += l.val * Math.pow(10, i);
            i++;
            l = l.next;
        }
        return number;
    }

    public ListNode convertNumberToLinkedList(long num) {
        if (num < 10) {
            return new ListNode((int)num);
        }
        long remainder = num % 10;
        ListNode head = new ListNode((int)remainder);
        ListNode prev = head;
        num = num /10;

        while (num != 0) {
            remainder = num % 10;
            ListNode node = new ListNode((int)remainder);
            prev.next = node;
            prev = node;
            num = num / 10;
        }

        return head;
    }
}
