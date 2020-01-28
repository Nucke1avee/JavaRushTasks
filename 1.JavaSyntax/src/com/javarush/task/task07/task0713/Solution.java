package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> listOf3 = new ArrayList<>();
        ArrayList<Integer> listOf2 = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            firstList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < firstList.size(); i++) {
            if (firstList.get(i) % 2 == 0 && firstList.get(i) % 3 == 0) {
                listOf3.add(firstList.get(i));
                listOf2.add(firstList.get(i));
            } else if (firstList.get(i) % 2 == 0) listOf2.add(firstList.get(i));
            else if (firstList.get(i) % 3 == 0) listOf3.add(firstList.get(i));
            else otherList.add(firstList.get(i));
        }

        printList(listOf3);
        printList(listOf2);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer i : list) System.out.println(i);
    }
}
