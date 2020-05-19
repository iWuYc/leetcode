package com.iwuyc.leetcode.p001_p100;

import org.junit.Test;

public class P021Test {
    @Test
    public void name() {
        ListNode l10 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l10.next = l11;
        l11.next = l12;
        System.out.println(l10.toString());

        ListNode l20 = new ListNode(1);
        ListNode l21 = new ListNode(3);
        ListNode l22 = new ListNode(4);
        l20.next = l21;
        l21.next = l22;
        System.out.println(l20.toString());

        ListNode listNode = new P021.Solution().mergeTwoLists(l10, l20);
        System.out.println(listNode.toString());
    }
}