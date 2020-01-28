package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int min = list.get(0).length(), max = list.get(0).length();
        int minN = 0, maxN = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                minN = i;
            }
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxN = i;
            }
        }

        if (minN < maxN) System.out.println(list.get(minN));
        else System.out.println(list.get(maxN));
    }
}
