package com.letcode.java;

public class Solution06 {
    public int getcountion(int n) {

        int dep1 = 1;
        int dep2 = 2;
        int count =0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (n / 2); j++) {
                if ( i*dep1 + j*dep2 == n) count++;
            }
        }

        return count;
    }
}
