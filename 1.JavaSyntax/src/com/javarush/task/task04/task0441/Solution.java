package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(minMax(a, b, c));
    }

    private static int minMax(int a, int b, int c) {

        if (a == b || a == c) return a;
        else if (b == c) return b;
        else if ((a > b && a < c) || (a < b && a > c)) return a;
        else if ((b > a && b < c) || (b < a && b > c)) return b;
        //else if ((c > a && c < b) || (c < a && c > b)) return c;
        else return c;
    }
}
