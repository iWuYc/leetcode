package com.iwuyc.leetcode.p00001_p00100;

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
public interface P002 {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int addResult = l1.val + l2.val;
            int carry = addResult / 10;
            ListNode result = new ListNode(addResult % 10);
            ListNode currentResult = result;
            ListNode currentL1 = l1.next;
            ListNode currentL2 = l2.next;
            while (currentL1 != null || currentL2 != null) {
                if (currentL1 != null && currentL2 != null) {
                    addResult = currentL1.val + currentL2.val + carry;
                    currentL1 = currentL1.next;
                    currentL2 = currentL2.next;
                } else if (currentL1 != null) {
                    addResult = currentL1.val + carry;
                    currentL1 = currentL1.next;
                } else {
                    addResult = currentL2.val + carry;
                    currentL2 = currentL2.next;
                }

                carry = addResult / 10;
                currentResult.next = new ListNode(addResult % 10);
                currentResult = currentResult.next;
            }
            if (carry > 0) {
                currentResult.next = new ListNode(carry);
            }
            return result;
        }
    }

}
