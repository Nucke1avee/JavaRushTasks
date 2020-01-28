package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            FileInputStream fis1 = new FileInputStream(fileName1);

            byte[] buf = new byte[fis1.available()];
            while (fis1.available() > 0) {
                fis1.read(buf);
            }
            fis1.close();

            FileInputStream fis2 = new FileInputStream(fileName2);
            FileOutputStream fos1 = new FileOutputStream(fileName1);

            while (fis2.available() > 0) {
                fos1.write(fis2.read());
            }
            fis2.close();

            for (int i = 0; i < buf.length; i++) {
                fos1.write(buf[i]);
            }
            fos1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
