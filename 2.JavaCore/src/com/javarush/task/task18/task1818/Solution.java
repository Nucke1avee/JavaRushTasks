package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream fos = new FileOutputStream(reader.readLine());
            FileInputStream fis1 = new FileInputStream(reader.readLine());
            FileInputStream fis2 = new FileInputStream(reader.readLine());

            while (fis1.available() > 0) {
                fos.write(fis1.read());
            }

            while (fis2.available() > 0) {
                fos.write(fis2.read());
            }

            fos.close();
            fis1.close();
            fis2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
