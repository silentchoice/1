package com.letcode.java;


public class Solution09 {
    public boolean isOrNo(int[] nums, int target) {
        if (nums.length < 0) return false;
        if (nums.length == 1 && nums[0] != target) return false;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) return true;
        }
        return false;
    }
}

class Solution01 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    int[] num2 = {i, j};
                    return num2;
                }
            }
        }
        int[] num3 = {0, 0};
        return num3;
    }
}

class Solution1 {
    public int findMin(int[] nums) {
        int a = nums[0];
        if (nums.length <= 1) return a;

        for (int i = 0, j = (nums.length - 1); i < j; i++, j--) {


            if (nums[i] <= nums[j]) {
                if (nums[i] <= a) {
                    a = nums[i];
                    if (i == j ||i + 1 == j) {
                        return a;
                    } else {
                        if (i == j ||i + 1 == j) {
                            return a;
                        }
                    }
                } else {
                    if (nums[j] <= a) {
                        a = nums[j];
                        if (i == j ||i + 1 == j) {
                            return a;
                        } else {
                            if (i + 1 == j) {
                                return a;
                            }
                        }
                    }
                }


            }

        }
        return 0;
    }
}
