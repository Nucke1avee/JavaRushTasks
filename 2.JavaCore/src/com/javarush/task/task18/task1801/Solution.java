package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(name);

        int max = 0;
        while (fis.available() > 0) {
            int data = fis.read();
            if (max < data) max = data;
        }
        fis.close();

        System.out.println(max);
    }
}