package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();

        int[] a1 = new int[5];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = i;
        }

        int[] a2 = new int[2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = i;
        }

        int[] a3 = new int[4];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = i;
        }

        int[] a4 = new int[7];
        for (int i = 0; i < a4.length; i++) {
            a4[i] = i;
        }

        int[] a5 = new int[0];

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
