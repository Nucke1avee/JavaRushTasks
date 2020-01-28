package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);

            int[] arr = new int[256];
            while (fis.available() > 0) {
                int i = fis.read();
                arr[i]++;
            }
            fis.close();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    System.out.println((char) i + " " + arr[i]);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
