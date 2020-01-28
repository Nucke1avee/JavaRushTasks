package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new FileReader(reader.readLine()));
            reader.close();

            String[] token;
            String str;
            while ((str = br.readLine()) != null) {
                token = str.split(" ");
                if (token[0].equals(args[0])) break;
            }

            br.close();
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
