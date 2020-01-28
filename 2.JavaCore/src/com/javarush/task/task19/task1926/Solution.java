package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // D:\\1.txt
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fr.ready()) {
            String[] line = fr.readLine().split("");
            for (int i = line.length - 1; i >= 0; i--) {
                System.out.print(line[i]);
            }
            System.out.println();
        }

        fr.close();
    }
}
