package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            int id;
            String name = null;
            try {
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
            } catch (Exception e) {
                break;
            }
            //if (name.equals("")) break;
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getValue() + " " + m.getKey());
        }
    }
}
