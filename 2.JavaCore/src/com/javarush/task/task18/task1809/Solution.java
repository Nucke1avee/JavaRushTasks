package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fis = new FileInputStream(reader.readLine());
            FileOutputStream fos = new FileOutputStream(reader.readLine());

            if (fis.available() > 0) {
                byte[] buf = new byte[fis.available()];
                int count = fis.read(buf);
                byte[] fub = new byte[buf.length];
                for (int i = 0, k = buf.length - 1; i <= k; i++) {
                    fub[i] = buf[k - i];
                }
                fos.write(fub, 0, count);
            }
            fis.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
