package com.iwuyc.leetcode.p001_p100;

import java.util.Stack;

public interface P025 {
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k <= 0) {
                return head;
            }
            Stack<ListNode> stack = new Stack<>();
            ListNode cursor = head;
            ListNode result = null;
            ListNode lastCursor = head;
            while (cursor != null) {
                stack.push(cursor);
                cursor = cursor.next;
                stack.peek().next = null;
                if (stack.size() >= k) {
                    ListNode newList = stack.pop();
                    ListNode newListCursor = newList;
                    while (!stack.isEmpty()) {
                        newListCursor.next = stack.pop();
                        newListCursor = newListCursor.next;
                    }
                    if (result == null) {
                        result = newList;
                    } else {
                        lastCursor.next = newList;
                    }
                    lastCursor = newListCursor;
                }
            }
            if (!stack.isEmpty()) {
                ListNode newListCursor = stack.pop();
                while (!stack.isEmpty()) {
                    stack.peek().next = newListCursor;
                    newListCursor = stack.pop();
                }
                if (result == null) {
                    result = newListCursor;
                } else {
                    lastCursor.next = newListCursor;
                }
            }
            return result;
        }
    }
    class Solution2 {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k <= 0) {
                return head;
            }
            ListNode result = null;
            while (head != null){
                ListNode newListNode = head;
                for (int i = 1; i < k; i++) {
                    if (head.next == null){
                        // 不足k个，翻转成原来的顺序
                        newListNode = reverse(newListNode);
                        break;
                    }
                }
            }
            return result;
        }

        private ListNode reverse(ListNode newListNode) {

            return newListNode;
        }
    }
}
