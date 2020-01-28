package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(args[0]);

        HashMap<String, Double> map = new HashMap<>();
        ArrayList<String> sortedList = new ArrayList<>();
        String lines = "";
        while (fr.ready()) {
            lines += (char) fr.read();
        }
        fr.close();

        String[] strings = lines.split(System.lineSeparator());

        for (String s : strings) {
            String[] l = s.split(" ");
            if (map.containsKey(l[0])) {
                map.put(l[0], Double.parseDouble(l[1]) + map.get(l[0]));
            } else map.put(l[0], Double.parseDouble(l[1]));
        }

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            sortedList.add(pair.getKey() + " " + pair.getValue());
        }
        Collections.sort(sortedList);

        for (String s : sortedList) {
            System.out.println(s);
        }
    }
}
