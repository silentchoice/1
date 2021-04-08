package com.letcode.java;

import java.util.Arrays;

public class Solution08 {
    public String reserve_int(int [] nums){
        int tmp =0;

        for (int i=0,j=nums.length-1;i<j;i++,j--){
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j]=tmp;
//            nums[i]=nums[i]^nums[j];
//            nums[j]=nums[i]^nums[j];
        }
        return Arrays.toString(nums);
    }
//    public ListNode reverseList(ListNode head){

    }

