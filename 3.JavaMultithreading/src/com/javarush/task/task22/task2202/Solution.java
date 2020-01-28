package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) throw new TooShortStringException();
        String[] s = string.split(" ");
        if (s.length < 5) throw new TooShortStringException();
        else {
            StringBuilder res = new StringBuilder();
            res.append(s[1]).append(" ").append(s[2]).append(" ").append(s[3]).append(" ").append(s[4]);
            return res.toString();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
