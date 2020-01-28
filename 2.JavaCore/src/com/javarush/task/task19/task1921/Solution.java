package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));

        String[] line;
        while (fr.ready()) {
            line = fr.readLine().split(" ");
            String name, tmpDate;
            Date birthDate;
            SimpleDateFormat sdf = new SimpleDateFormat("d M y", Locale.ENGLISH);
            switch (line.length) {
                case 4:
                    name = line[0];
                    tmpDate = line[1] + " " + line[2] + " " + line[3];
                    birthDate = sdf.parse(tmpDate);
                    PEOPLE.add(new Person(name, birthDate));
                    break;
                case 5:
                    name = line[0] + " " + line[1];
                    tmpDate = line[2] + " " + line[3] + " " + line[4];
                    birthDate = sdf.parse(tmpDate);
                    PEOPLE.add(new Person(name, birthDate));
                    break;
                case 6:
                    name = line[0] + " " + line[1] + " " + line[2];
                    tmpDate = line[3] + " " + line[4] + " " + line[5];
                    birthDate = sdf.parse(tmpDate);
                    PEOPLE.add(new Person(name, birthDate));
                    break;
            }
        }
        fr.close();
    }
}
