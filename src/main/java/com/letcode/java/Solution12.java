package com.letcode.java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution12 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        int count =0;
        String s = Integer.toString(x);
        ArrayList<Integer> integers = new ArrayList<>();
//        int [] count ={0};
        if (x<100&&s.charAt(0)==s.charAt(1)) return true;
        if (x<100&&s.charAt(0)!=s.charAt(1)) return false;
        if (s.length()%2 == 0){
            for (int i=0,j=s.length()-1;i<j;i++,j--){
                if (s.charAt(i)==s.charAt(j)) integers.add(1);
            }

            System.out.println(integers);
            if (s.length()/2 == integers.size()) return true;
        }
        if (s.length()%2==1){
            for (int i=0,j=s.length()-1;i<j+1;i++,j--){
                if (s.charAt(i)==s.charAt(j)) integers.add(1);
            }
            System.out.println(integers);
            if (s.length()/2 == integers.size()-1) return true;
        }


        return false;
    }
}
