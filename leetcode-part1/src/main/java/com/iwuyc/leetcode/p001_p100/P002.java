package com.iwuyc.leetcode.p001_p100;

/**
 * 2. Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 *
 * @author iWuYc
 */
public class P002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currentResultNode = result;

        do {
            currentResultNode.val = l1.val + l2.val + currentResultNode.val;
            boolean isCarry = currentResultNode.val > 9;
            if (isCarry) {
                currentResultNode.val -= 10;
                currentResultNode.next = new ListNode(1);
            } else {
                currentResultNode.next = new ListNode(0);
            }

            if (l1.next == null && l2.next == null) {
                if (currentResultNode.next.val == 0) {
                    currentResultNode.next = null;
                }
                break;
            }
            l1 = l1.next == null ? new ListNode(0) : l1.next;
            l2 = l2.next == null ? new ListNode(0) : l2.next;
            currentResultNode = currentResultNode.next;
        } while (true);

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
