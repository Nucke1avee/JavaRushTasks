package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Byte> list = new ArrayList<>();

        while (fis.available() > 0) {
            byte b = (byte) fis.read();
            if (!list.contains(b)) {
                list.add(b);
            }
        }
        fis.close();

        Collections.sort(list);

        for (Byte b : list) {
            System.out.print(b + " ");
        }
    }
}
