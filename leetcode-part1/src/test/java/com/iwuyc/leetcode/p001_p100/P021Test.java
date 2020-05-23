package com.iwuyc.leetcode.p001_p100;

import org.junit.Test;

public class P021Test {
    @Test
    public void name() {
        ListNode l10 = ListNode.create(1, 2, 4);
        System.out.println(l10.printList());

        ListNode l20 = ListNode.create(1, 3, 4);
        System.out.println(l20.printList());

        ListNode listNode = new P021.Solution().mergeTwoLists(l10, l20);
        System.out.println("result:" + listNode.printList());

        ListNode l11 = ListNode.create(5);
        ListNode l21 = ListNode.create(1, 2, 4);

        ListNode listNode1 = new P021.Solution().mergeTwoLists(l11, l21);
        System.out.println("result:" + listNode1.printList());
    }
}