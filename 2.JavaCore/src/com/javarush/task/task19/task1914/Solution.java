package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintStream);
        testString.printSomething();

        String line = byteArrayOutputStream.toString();
        System.setOut(printStream);

        String[] res = line.split(" ");
        int result = 0;
        switch (res[1]) {
            case "+":
                result = Integer.parseInt(res[0]) + Integer.parseInt(res[2]);
                break;
            case "-":
                result = Integer.parseInt(res[0]) - Integer.parseInt(res[2]);
                break;

            case "*":
                result = Integer.parseInt(res[0]) * Integer.parseInt(res[2]);
                break;
        }

        System.out.print(line.trim() + " " + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

