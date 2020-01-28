package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        try {
            /*
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String url = reader.readLine();
            url = url.substring(url.indexOf('?') + 1);

            String[] keys = url.split("&");
            ArrayList<String> values = new ArrayList<>();

            for (int i = 0; i < keys.length; i++) {
                if (keys[i].contains("=")) {
                    int j = keys[i].indexOf("=");
                    values.add(keys[i].substring(j + 1));
                    keys[i] = keys[i].substring(0, j);
                }
            }

            for (String s : keys) System.out.print(s + " ");
            System.out.println();
            for (String s : values) {
                try {
                    alert(Double.parseDouble(s));
                } catch (Exception e) {
                    alert(s);
                }
            }
            */

            String URL = new BufferedReader(new InputStreamReader(System.in)).readLine().replaceAll("^(.*?\\?)", "");
            for (String s : URL.split("&")) System.out.print(s.replaceAll("=.*$", "") + " ");
            System.out.println();
            for (String s : URL.split("&")) {
                if (s.replaceAll("=.*$", "").equals("obj")) {
                    try {
                        alert(Double.parseDouble(s = s.replaceAll("^[^=]*=", "")));
                    } catch (NumberFormatException e) {
                        alert(s);
                    }
                }
            }


        } catch (Exception e) {
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
