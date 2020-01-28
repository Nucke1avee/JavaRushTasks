package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fw = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        String s = "";
        while (fr.ready()) {
            s += (char) fr.read();
        }
        //System.out.println(s);
        fr.close();
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (str[i].matches("\\d+")) {  //соответствует ли строка регулярному выражению (в данном случае - число, "+" значит что чисел может быть несколько)
                if (i != str.length - 1) {
                    fw.write(str[i] + " ");
                } else {
                    fw.write(str[i]);
                }
            }
        }
        fw.close();
    }
}
