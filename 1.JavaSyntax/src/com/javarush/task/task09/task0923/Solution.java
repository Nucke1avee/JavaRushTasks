package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> glas = new ArrayList<>();
        ArrayList<Character> soglas = new ArrayList<>();
        String s = reader.readLine();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (isVowel(sb.charAt(i))) glas.add(sb.charAt(i));
            else if (!isVowel(sb.charAt(i)) && sb.charAt(i) != ' ') soglas.add(sb.charAt(i));
        }

        for (Character c : glas) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (Character c : soglas) {
            System.out.print(c + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}