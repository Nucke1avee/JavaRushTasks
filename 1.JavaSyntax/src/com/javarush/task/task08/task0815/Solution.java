package com.javarush.task.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> names = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            names.put(Integer.toString(i), Integer.toString(i + 1000));
        }
        return names;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;

        for (Map.Entry<String, String> mp : map.entrySet()) {
            if (mp.getValue().equals(name)) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;

        for (Map.Entry<String, String> mp : map.entrySet()) {
            if (mp.getKey().equals(lastName)) count++;
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
