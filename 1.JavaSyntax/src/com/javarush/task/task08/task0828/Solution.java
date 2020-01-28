package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> dates = new HashMap<>();

        dates.put("January", 1);
        dates.put("February", 2);
        dates.put("March", 3);
        dates.put("April", 4);
        dates.put("May", 5);
        dates.put("June", 6);
        dates.put("July", 7);
        dates.put("August", 8);
        dates.put("September", 9);
        dates.put("October", 10);
        dates.put("November", 11);
        dates.put("December", 12);

        String monthName = reader.readLine();

        System.out.println(monthName + " is the " + dates.get(monthName) + " month");
    }
}
