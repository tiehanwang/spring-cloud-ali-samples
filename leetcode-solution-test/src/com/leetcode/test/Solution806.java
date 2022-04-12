package com.leetcode.test;

/**
 * @ClassName: Solution806
 * @Description: Solution leetcode question 806
 * @Author: TIEHAN WANG
 * @Date: 2022/4/12 8:33
 * @Version: v1.0
 */
public class Solution806 {
    public static final int MAX_WIDTH = 100;

    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int width = 0;
        for (int i = 0; i < s.length(); i++) {
            int need = widths[s.charAt(i) - 'a'];
            width += need;
            if (width > MAX_WIDTH) {
                lines++;
                width = need;
            }
        }
        return new int[]{lines, width};
    }
}
