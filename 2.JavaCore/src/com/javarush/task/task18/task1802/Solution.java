package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(name);

        int min = fis.read();
        while (fis.available() > 0) {
            int data = fis.read();
            if (min > data) min = data;
        }
        fis.close();

        System.out.println(min);
    }
}
