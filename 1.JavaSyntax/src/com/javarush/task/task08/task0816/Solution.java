package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("qwzxczxce", df.parse("JUNE 1 1980"));
        map.put("asasdasdd", df.parse("JUNE 1 1980"));
        map.put("zasdqwexc", df.parse("JUNE 1 1980"));
        map.put("asdStallone", df.parse("MARCH 1 1980"));
        map.put("Staasdllone", df.parse("JUNE 1 1980"));
        map.put("Stalzxclone", df.parse("JUNE 1 1980"));
        map.put("Stalleqone", df.parse("DECEMBER 1 1980"));
        map.put("Stalfalone", df.parse("JUNE 1 1980"));
        map.put("Stalvcxlone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            String s = pair.getValue().toString();
            if (s.contains("Jun") || s.contains("Jul") || s.contains("Aug")) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
