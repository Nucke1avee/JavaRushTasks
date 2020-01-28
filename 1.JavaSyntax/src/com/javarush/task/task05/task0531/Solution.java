package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность через опу
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minimum;
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        minimum = min(a[0], a[1], a[2], a[3], a[4]);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        return minn(minn(minn(a, b), minn(b, c)), minn(minn(c, d), minn(d, e)));
    }

    public static int minn(int a, int b) {
        return a < b ? a : b;
    }
}
