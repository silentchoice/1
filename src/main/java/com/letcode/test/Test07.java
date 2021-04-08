package com.letcode.test;

import com.letcode.java.Solution07;

public class Test07 {
    public static void main(String[] args) {
        Solution07 solution07 = new Solution07();
        int [] nums ={3,2,3,1,2,4,5,5,6};
        int i = solution07.kMaxNumber(nums, 4);
        System.out.println(i);
    }
}
