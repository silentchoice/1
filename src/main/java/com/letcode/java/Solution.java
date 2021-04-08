package com.letcode.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public String frequencySort(String s) {
        int count =1;
        char[] chars = new char[s.length()];
        String s1 = new String();
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length()-1; i++) {
            char c = s.charAt(i);
            characters.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            boolean contains = characters.contains(s.charAt(i));
            if (contains) count++;
        }

        return "";

    }
}
