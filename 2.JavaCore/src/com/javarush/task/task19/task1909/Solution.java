package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fw = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        ArrayList<Character> list = new ArrayList<>();
        while (fr.ready()) {
            list.add((char) fr.read());
        }

        for (Character c : list) {
            if (c.equals('.')) {
                c = '!';
            }
            fw.write(c);
        }
        fr.close();
        fw.close();
    }
}
