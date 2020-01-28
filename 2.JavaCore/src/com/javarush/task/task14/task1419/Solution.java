package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
        try {
            int[] i = new int[1];
            for (int j = 0; j < i.length + 5; j++) {
                i[j] += j;
            }

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            //3
            int[] i = new int[-1];

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            //4
            String s = "";
            String ss = s.substring(-1);


        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            //5
            throw new IllegalThreadStateException();


        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            //6
            throw new UnsupportedOperationException();


        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            //7
            throw new SecurityException();


        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            //8
            throw new IllegalAccessException();


        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            //9
            throw new InstantiationException();


        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            //10
            throw new NoSuchMethodException();


        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
