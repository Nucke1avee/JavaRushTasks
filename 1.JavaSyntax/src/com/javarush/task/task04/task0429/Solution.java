package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] a = new int[3];
        a[0] = Integer.parseInt(reader.readLine());
        a[1] = Integer.parseInt(reader.readLine());
        a[2] = Integer.parseInt(reader.readLine());
        int pros = 0, cons = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) pros++;
            else if (a[i] < 0) cons++;
            //
        }

        System.out.println("количество отрицательных чисел: "+ cons);
        System.out.println("количество положительных чисел: "+ pros);
    }
}
