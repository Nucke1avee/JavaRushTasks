package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] a = new String[10];
        for (int i = 0; i < a.length - 2; i++) {
            a[i] = reader.readLine();
        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}