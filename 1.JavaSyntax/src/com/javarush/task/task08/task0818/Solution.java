package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("qwe", 600);
        map.put("qawe", 6000);
        map.put("qaweq", 6000);
        map.put("qaweqq", 4100);
        map.put("qawefqq", 4020);
        map.put("qasweqq", 400);
        map.put("qasweqaq", 400);
        map.put("qaswevqsq", 400);
        map.put("qasweqxsq", 4000);
        map.put("qasweqszq", 400);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> path = iterator.next();
            int value = path.getValue();
            if (value < 500)  iterator.remove();
        }
    }

    public static void main(String[] args) {
        //
//        HashMap<String, Integer> map = createMap();
//        for (Map.Entry<String, Integer> m : map.entrySet()){
//            System.out.println(m.getKey() + " - " + m.getValue());
//        }
//        System.out.println("-----------------");
//        removeItemFromMap(map);
//
//        for (Map.Entry<String, Integer> m : map.entrySet()){
//            System.out.println(m.getKey() + " - " + m.getValue());
//        }
//
//        //
    }
}