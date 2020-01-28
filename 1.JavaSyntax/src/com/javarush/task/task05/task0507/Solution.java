package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, n = 0, i = 0;
        double aver = 0.0;

        while (true) {
            n = Integer.parseInt(reader.readLine());
            if (n != -1) {
                sum += n;
                i++;
            } else break;
        }

        aver = (double) sum / (double) i;
        //aver = Double.parseDouble(Integer.toString(sum)) / Double.parseDouble(Integer.toString(i));
        System.out.println(aver);
    }
}

