package com.letcode.java;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Solution02 {

    public int minMoves(int[] nums) {
        int count = 0;
        if (nums.length <= 1) {
            return 0;
        } else {
            boolean f = true;

            while (true) {
                int sum = 0;
                for (int i = 0; i < nums.length; i++) {
                    sum += nums[i];
                }
                double avg = sum * 1.0 / nums.length;
                if (avg == (double) nums[0]) {
                    f = false;
                    return count;
                } else {
                    Arrays.sort(nums);
                    for (int i = 0; i < nums.length - 1; i++) {
                        nums[i]++;
                    }
                    count++;
                }
            }
        }

    }
}
