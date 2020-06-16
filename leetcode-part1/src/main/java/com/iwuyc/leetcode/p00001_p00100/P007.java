package com.iwuyc.leetcode.p00001_p00100;

public interface P007 {
    class Solution {
        public int reverse(int x) {
            if (!(x < -9 || x > 9)) {
                return x;
            }
            boolean lassThenZero;
            if (x < 0) {
                lassThenZero = true;
                x = -x;
            } else {
                lassThenZero = false;
            }
            int result = 0;
            while (x != 0) {
                result = result * 10 + x % 10;
                x /= 10;
                if (result < 0) {
                    return 0;
                }
            }

            return lassThenZero ? -result : result;
        }
    }
}
