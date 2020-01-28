package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] count = new int[alphabet.size()]; //создаем массив для подсчета букв

        for (int g = 0; g < list.size(); g++) //цикл для прохода по списку введенных строк

        {
            char[] yy = list.get(g).toCharArray(); //создаем массив символов для хранения полученной строки
            for (int u = 0; u < yy.length; u++) // проходим по полученному массиву
            {
                for (int q = 0; q < abcArray.length; q++)
                    if (yy[u] == abcArray[q])  // Если элемент не является буквой русского алфавита, он пропукскается, в противном случае значение индекса буквы увеличивается
                        count[alphabet.indexOf(yy[u])]++;
            }
        }
        for (int r = 0; r < alphabet.size(); r++) // вывод списка + массив
        {
            System.out.print(alphabet.get(r) + " ");
            System.out.print(count[r]);
            System.out.println();
        }

        // напишите тут ваш код
    }

}
