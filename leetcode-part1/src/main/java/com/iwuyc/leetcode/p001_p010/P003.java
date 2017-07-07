package com.iwuyc.leetcode.p001_p010;

import java.util.HashMap;

/**
 * 3. Longest Substring Without Repeating Characters
 * 
 * Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * Examples:
 * 
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * 
 * Given "bbbbb", the answer is "b", with the length of 1.
 * 
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
 * answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * @author iWuYc
 *
 */
public class P003 {
	public int lengthOfLongestSubstring(String s) {
		int longestLength = 0;
		HashMap<Character, Integer> charsWithoutRepeating = new HashMap<>(16);
		int begin = 0;
		char[] removeKeys = null;
		int location = 0;
		char currentChar = 0;
		for (int i = 0; i < s.length(); i++) {
			currentChar = s.charAt(i);
			if (charsWithoutRepeating.containsKey(currentChar)) {
				if (longestLength < charsWithoutRepeating.size()) {
					longestLength = charsWithoutRepeating.size();
				}
				location = charsWithoutRepeating.get(currentChar);
				removeKeys = new char[location - begin + 1];
				s.getChars(begin, location + 1, removeKeys, 0);
				removeAll(charsWithoutRepeating, removeKeys);
				begin = location + 1;
			}
			charsWithoutRepeating.put(currentChar, i);
		}

		return longestLength >= charsWithoutRepeating.size() ? longestLength : charsWithoutRepeating.size();
	}

	private void removeAll(HashMap<Character, Integer> charsWithoutRepeating, char[] removeKeys) {
		for (char c : removeKeys) {
			charsWithoutRepeating.remove(c);
		}
	}
}