package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[15];
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) evenSum += a[i];
            else oddSum += a[i];
        }

        if (evenSum > oddSum) System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (evenSum < oddSum) System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
