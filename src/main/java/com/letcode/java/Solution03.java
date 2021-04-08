package com.letcode.java;

public class Solution03 {

    public int findString(String[] words, String s) {
        int relust = -1;
        if (words.length < 1) return relust;
        for (int i = 0; i < words.length; i++) {
            if (s.equals(words[i]))
                return i;
        }

        return relust;
    }

}
