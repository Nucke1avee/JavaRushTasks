package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String [] getTokens(String query, String delimiter) {
        String[] strings;
        ArrayList<String> str = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(query, delimiter);
        while (st.hasMoreTokens()) {
            str.add(st.nextToken());
        }
        strings = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            strings[i] = str.get(i);
        }
        return strings;
    }
}
