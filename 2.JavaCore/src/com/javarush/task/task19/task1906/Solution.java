package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        FileWriter fw = new FileWriter(reader.readLine());

        int count = 1;
        while (fr.ready()) {
            if (count %2 == 0) {
                fw.write(fr.read());
            } else {
                fr.read();
            }
            count++;
        }

        reader.close();
        fr.close();
        fw.close();
    }
}
