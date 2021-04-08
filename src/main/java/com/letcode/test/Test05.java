package com.letcode.test;

import com.letcode.java.Solution05;

public class Test05 {
    public static void main(String[] args) {
        Solution05 solution05 = new Solution05();
        int [] g = {1,2,3};
        int [] s = {1,1,1,1,1,1,1,1,1,2};
        int contentChildren = solution05.findContentChildren(g, s);
        System.out.println(contentChildren);
    }
}
