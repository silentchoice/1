package com.letcode.test;

import com.letcode.java.Solution02;

import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Test02 {
    public static void main(String[] args) throws IOException {
//        int [] arg ={1,2,5,3};
//        Solution02 solution02 = new Solution02();
//        solution02.minMoves(arg);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        int i1 = parseInt(s1);
        int i2 = parseInt(s2);
        System.out.println(i1+i2);

        int [] n ={1};
        System.out.println(n.length);
    }
}
