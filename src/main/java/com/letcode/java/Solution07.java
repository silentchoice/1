package com.letcode.java;

import java.util.Arrays;

public class Solution07 {
    public int kMaxNumber (int [] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
