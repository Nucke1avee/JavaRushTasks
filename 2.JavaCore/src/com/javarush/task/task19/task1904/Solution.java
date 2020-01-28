package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] splitLine = fileScanner.nextLine().split(" ");
            //имя отчество фамилия др - надо
            //Иванов Иван Иванович 31 12 1950 - есть
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            String stringDate = splitLine[3] + " " + splitLine[4] + " " + splitLine[5];
            Date date = null;
            try {
                date = sdf.parse(stringDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Person person = new Person(splitLine[1],
                    splitLine[2],
                    splitLine[0],
                    date
            );

            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
