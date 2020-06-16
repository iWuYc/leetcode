package com.iwuyc.leetcode.p00001_p00100;

import org.junit.Test;

public class P003Test {

    @Test
    public void test() {
        P003.Solution solution = new P003.Solution();
        String s = "abcabcbb";
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    @Test
    public void test1() {
        P003.Solution solution = new P003.Solution();
        String s = "bbbbb";
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    @Test
    public void test2() {
        P003.Solution solution = new P003.Solution();
        String s = "pwwkew";
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    @Test
    public void test3() {
        P003.Solution solution = new P003.Solution();
        String s = "abcbdef";
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    @Test
    public void test4() {
        P003.Solution solution = new P003.Solution();
        String s = "abcbdefbc";
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    @Test
    public void test5() {
        P003.Solution solution = new P003.Solution();
        String s = "bpfbhmipx";
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println(length);
    }
}
