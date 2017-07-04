package com.iwuyc.leetcode.p001_p010;

import java.util.HashSet;

/**
 * 1.Two
 * 
 * Sum Given an array of integers, return indices of the two numbers such that
 * they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] =
 * 2 + 7 = 9, return [0, 1].
 * 
 * @author iWuYc
 *
 */
public class P001 {

	public int[] twoSum(int[] nums, int target) {
		HashSet<Integer> numsSet = new HashSet<>(nums.length);
		int subResult = 0;
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			subResult = target - nums[i];
			if (numsSet.contains(subResult)) {
				result[1] = i;

				for (int j = 0; j < i; j++) {
					if (subResult == nums[j]) {
						result[0] = j;
						break;
					}
				}
				break;
			}
			numsSet.add(nums[i]);
		}

		return result;
	}
}
