package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fw = new BufferedWriter(new FileWriter(args[1]));

        ArrayList<String> list = new ArrayList<>();
        while (fr.ready()) {
            String[] strings = fr.readLine().split(" ");
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() > 6) {
                    list.add(strings[i] + ",");
                }
            }
        }
        list.add(list.size() - 1, list.get(list.size() - 1).substring(0, list.get(list.size() - 1).length() - 1));
        list.remove(list.size() - 1);

        for (String s : list) {
            fw.write(s);
        }

        fr.close();
        fw.close();
    }
}
