package com.iwuyc.leetcode.p001_p100;

import java.util.Stack;

public interface P025 {
    /**
     * 栈的方式：stack
     */
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k < 2) {
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

    /**
     * ListNode
     */
    class Solution2 {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k < 2) {
                return head;
            }
            ListNode result = null;
            ListNode resultLast = null;
            while (head != null) {
                int count = 1;
                ListNode newList = head;
                ListNode newListLast = newList;
                head = head.next;
                newList.next = null;
                boolean enough = false;
                while (head != null) {
                    ListNode tmp = head.next;
                    head.next = newList;
                    newList = head;
                    head = tmp;
                    count++;
                    if (count >= k) {
                        enough = true;
                        break;
                    }
                }
                if (!enough) {
                    ListNode newListCursor = newList.next;
                    newList.next = null;
                    while (newListCursor != null) {
                        ListNode tmp = newListCursor.next;
                        newListCursor.next = newList;
                        newList = newListCursor;
                        newListCursor = tmp;
                    }
                }
                if (result == null) {
                    result = newList;
                } else {
                    resultLast.next = newList;
                }
                resultLast = newListLast;
            }
            return result;
        }

    }

    /**
     * 数组的方式：ListNode[]
     */
    class Solution3 {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k < 2) {
                return head;
            }
            ListNode[] listNodes = new ListNode[k];
            int counter = 0;
            final int maxIndex = k - 1;
            ListNode result = new ListNode(-1);
            ListNode resultCursor = result;
            while (head != null) {
                listNodes[counter] = head;
                head = head.next;
                listNodes[counter].next = null;
                if (counter == maxIndex) {
                    for (; counter >= 0; counter--) {
                        resultCursor.next = listNodes[counter];
                        resultCursor = resultCursor.next;
                    }
                }
                counter++;
            }
            if (counter != 0) {
                for (int i = 0; i < counter; i++) {
                    resultCursor.next = listNodes[i];
                    resultCursor = resultCursor.next;
                }
            }
            return result.next;
        }
    }
}
