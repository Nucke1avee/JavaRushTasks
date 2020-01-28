package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
            while (is.ready()) {
                list.add(Integer.parseInt(is.readLine()));
            }
            is.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 != 0) list.remove(i);
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
