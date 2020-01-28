package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        String s = "";
        int word = 0;

        while (fileReader.ready()) {
            int data = fileReader.read();
            s += (char) data;
        }
        String[] res2 = s.split("[\\p{IsPunctuation}\\p{IsWhite_Space}]+");
        for (int i = 0; i < res2.length; i++) {
            if (res2[i].equals("world")) {
                word++;
            }

        }

        System.out.println(word);
        reader.close();
        fileReader.close();
    }
}

