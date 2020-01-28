package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("qwe", "asd");
        map.put("asd", "asd");
        map.put("asd", "zxzc");
        map.put("asasdd", "zxc");
        map.put("asasdad", "zxcxzc");
        map.put("asasdaad", "zxxxc");
        map.put("asasdaaad", "zdsaxc");
        map.put("asasdaaasd", "zxc");
        map.put("asasdaaasad", "zxasdc");
        map.put("asasdaaasad", "zxcxc");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
