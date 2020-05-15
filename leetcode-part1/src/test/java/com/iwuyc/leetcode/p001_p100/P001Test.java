package com.iwuyc.leetcode.p001_p100;

import org.junit.Test;

import java.util.Arrays;

public class P001Test {

    @Test
    public void test() {
        int[] nums = {2, 11, 15, 7};
        int target = 9;
        int[] result = new P001().twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = new P001().twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
