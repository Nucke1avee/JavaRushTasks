package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fr.ready()) {
            int count = 0;
            String line = fr.readLine();
            String[] lineArray = line.split(" ");
            for (String s : lineArray) {
                if (words.contains(s)) count++;
            }
            if (count == 2) System.out.println(line);
        }
        fr.close();
    }
}
