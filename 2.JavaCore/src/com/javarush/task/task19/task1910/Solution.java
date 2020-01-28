package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fw = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        String s = "";
        while (fr.ready()) {
            s += (char) fr.read();
        }

        String result = s.replaceAll("[^a-zA-Z\\d\\s[\\n]]", "");
        fw.write(result);

        fr.close();
        fw.close();
    }
}
