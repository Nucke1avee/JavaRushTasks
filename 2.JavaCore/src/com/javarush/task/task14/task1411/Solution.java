package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.javarush.task.task14.task1411.Person.*;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<String> keys = new ArrayList<>();

        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
            if (key.equals("user") || key.equals("loser") ||key.equals("coder") || key.equals("proger"))
            keys.add(key);
            else break;
        }

        for (String s : keys) {
            switch (s) {
                case "user":
                    person = new User();
                    break;
                case "loser":
                    person = new Loser();
                    break;
                case "coder":
                    person = new Coder();
                    break;
                case "proger":
                    person = new Proger();
                    break;
            }
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof User) ((User) person).live();
        else if (person instanceof Loser) ((Loser) person).doNothing();
        else if (person instanceof Coder) ((Coder) person).coding();
        else if (person instanceof Proger) ((Proger) person).enjoy();
    }
}
