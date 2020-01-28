package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread5 extends Thread {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = 0;

    @Override
    public void run() {
        while (true) {
            try {
                String s = reader.readLine();
                if (s.equals("N")) break;
                n = n + Integer.parseInt(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(n);
    }
}
