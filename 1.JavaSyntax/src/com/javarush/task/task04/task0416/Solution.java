package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(reader.readLine());
        double b = a % 5;

        if (b >= 0 && b < 3) System.out.println("зелёный");
        else if (b >= 3 && b < 4) System.out.println("жёлтый");
        else System.out.println("красный");
    }
}