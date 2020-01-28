package com.javarush.task.task16.task1632;

import static java.lang.Thread.sleep;

public class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}
