package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader.readLine();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(name));

            while (true) {
                String s = reader.readLine();
                bufferedWriter.write(s + "\r\n");
                if (s.equals("exit")) break;
            }

            bufferedWriter.flush();
            bufferedWriter.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
