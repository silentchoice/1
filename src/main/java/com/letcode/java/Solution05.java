package com.letcode.java;

import java.util.Arrays;

public class Solution05 {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length < 1 || s.length < 1) return 0;
        int numOfChildren = g.length, numOfCookies = s.length;
        int count = 0;
        for (int i = 0, j = 0; i < numOfChildren && j < numOfCookies; i++, j++) {
            while (j < numOfCookies && g[i] > s[j]) {
                j++;
            }
            if (j < numOfCookies) {
                count++;
            }
        }
        return count;
    }
}
