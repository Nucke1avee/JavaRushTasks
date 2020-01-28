package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> m : params.entrySet()) {
            if (m.getValue() != null) {
                sb.append(m.getKey()).append(" = '").append(m.getValue()).append("' and ");
            }
        }
        if (sb.length() > 0) return sb.substring(0, sb.length() - 5);
        return "";
    }
}
