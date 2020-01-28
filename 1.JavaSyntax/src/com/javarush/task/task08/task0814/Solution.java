package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(15);
        set.add(151);
        set.add(1513);
        set.add(15134);
        set.add(151345);
        set.add(12);
        set.add(121);
        set.add(1213);
        set.add(12132);
        set.add(121321);
        set.add(1213121);
        set.add(101);
        set.add(1011);
        set.add(10112);
        set.add(101123);
        set.add(1011232);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш ко
        HashSet<Integer> setRes = new HashSet<>();
        for (Integer s : set) {
            if (s <= 10) setRes.add(s);
        }
        return setRes;
    }

    public static void main(String[] args) {

    }
}
