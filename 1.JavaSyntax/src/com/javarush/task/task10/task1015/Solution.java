package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] wtf = new ArrayList[2];
        ArrayList<String> qqq = new ArrayList<>();
        ArrayList<String> www = new ArrayList<>();
        qqq.add("qweasd");
        qqq.add("qweasdaaa");
        www.add("qweasda112a");
        www.add("qweasda156aa");
        wtf[0] = qqq;
        wtf[1] = www;

        return wtf;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}