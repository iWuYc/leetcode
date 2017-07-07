package com.iwuyc.leetcode.p001_p010;

import org.junit.Test;

public class P003Test {

	@Test
	public void test() {
		P003 p003 = new P003();
		String s = "abcabcbb";
		int length = p003.lengthOfLongestSubstring(s);
		System.out.println(length);
	}

	@Test
	public void test1() {
		P003 p003 = new P003();
		String s = "bbbbb";
		int length = p003.lengthOfLongestSubstring(s);
		System.out.println(length);
	}

	@Test
	public void test2() {
		P003 p003 = new P003();
		String s = "pwwkew";
		int length = p003.lengthOfLongestSubstring(s);
		System.out.println(length);
	}

	@Test
	public void test3() {
		P003 p003 = new P003();
		String s = "abcbdef";
		int length = p003.lengthOfLongestSubstring(s);
		System.out.println(length);
	}

	@Test
	public void test4() {
		P003 p003 = new P003();
		String s = "abcbdefbc";
		int length = p003.lengthOfLongestSubstring(s);
		System.out.println(length);
	}

	@Test
	public void test5() {
		P003 p003 = new P003();
		String s = "bpfbhmipx";
		int length = p003.lengthOfLongestSubstring(s);
		System.out.println(length);
	}
}
