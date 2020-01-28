package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));

        TreeMap<String, Double> m = new TreeMap<>();

        while (fr.ready()) {
            String[] s = fr.readLine().split(" ");
            if (m.containsKey(s[0])) {
                m.put(s[0], m.get(s[0]) + Double.parseDouble(s[1]));
            } else m.put(s[0], Double.parseDouble(s[1]));
        }
        fr.close();

        Set<String> set = new TreeSet<>();

        double amount = Collections.max(m.values());
        for (Map.Entry<String, Double> pair : m.entrySet())
            if (pair.getValue() >= amount) set.add(pair.getKey());
        for (String x : set) System.out.println(x);


    }
}
