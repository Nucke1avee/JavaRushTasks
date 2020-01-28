package com.javarush.task.task20.task2025;

import java.util.ArrayList;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = null;
        ArrayList<Long> tmpRes = new ArrayList<>();

        for (long i = 0; i < N; i++) {
            String s = "" + i;
            for (int j = 1; j <= s.length(); j++) {
                double sum = Math.pow(s.charAt(s.length() - j) , s.length());
                System.out.println(sum);
            }
        }

        result = new long[tmpRes.size()];
        for (int i = 0; i != tmpRes.size(); i++) {
            result[i] = tmpRes.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        for (Long l : getNumbers(9999)) {
            System.out.print(l + " ");
        }
    }
}
