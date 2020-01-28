package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);

            int spaces = 0;
            int totalChars = 0;
            while (fis.available() > 0) {
                totalChars++;
                if (fis.read() == 32) {
                    spaces++;
                }
            }
            fis.close();
            System.out.println(String.format("%.2f", (double) spaces / totalChars * 100 * 1.0));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
