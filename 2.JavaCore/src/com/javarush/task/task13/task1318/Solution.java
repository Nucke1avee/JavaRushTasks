package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            InputStream inputStream = new FileInputStream(reader.readLine());
            reader.close();

            while (inputStream.available() > 0) {
                System.out.print((char) inputStream.read());
            }
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}