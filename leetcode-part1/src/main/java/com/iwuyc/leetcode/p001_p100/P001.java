package com.iwuyc.leetcode.p001_p100;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.Two
 * <p>
 * Sum Given an array of integers, return indices of the two numbers such that
 * they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * <p>
 * Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] =
 * 2 + 7 = 9, return [0, 1].
 *
 * @author iWuYc
 */
public interface P001 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> numberIndex = new HashMap<>();
            int resultNum;
            int num;
            for (int i = 0; i < nums.length; i++) {
                num = nums[i];
                resultNum = target - num;
                if (numberIndex.containsKey(resultNum)) {
                    return new int[]{numberIndex.get(resultNum), i};
                } else {
                    numberIndex.put(num, i);
                }
            }
            return null;
        }
    }
}
