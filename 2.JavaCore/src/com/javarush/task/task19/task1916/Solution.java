package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader originalFileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader editedFileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        ArrayList<String> f1 = new ArrayList<>();
        ArrayList<String> f2 = new ArrayList<>();

        while (originalFileReader.ready()){
            f1.add(originalFileReader.readLine());
        }
        originalFileReader.close();

        while (editedFileReader.ready()){
            f2.add(editedFileReader.readLine());
        }
        editedFileReader.close();

        for (int i = 0; i < f1.size() && i < f2.size(); i++) {
            try {
                if (f1.get(i).equals(f2.get(i))) {
                    lines.add(new LineItem(Type.SAME, f2.get(i)));
                    f1.remove(i);
                    f2.remove(i);
                    i--;
                } else if (!f1.get(i).equals(f2.get(i)) && !f1.get(i).equals(f2.get(i + 1))) {
                    lines.add(new LineItem(Type.REMOVED, f1.get(i)));
                    f1.remove(i);
                    i--;
                } else if (!f1.get(i).equals(f2.get(i)) && f1.get(i).equals(f2.get(i + 1))) {
                    lines.add(new LineItem(Type.ADDED, f2.get(i)));
                    f2.remove(i);
                    i--;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                lines.add(new LineItem(Type.REMOVED, f1.get(i)));
                f1.remove(i);
                i--;
            }
        }

        while (!f1.isEmpty()) {
            lines.add(new LineItem(Type.REMOVED, f1.get(0)));
            f1.remove(0);
        }
        while (!f2.isEmpty()) {
            lines.add(new LineItem(Type.ADDED, f2.get(0)));
            f2.remove(0);
        }

        for (LineItem t : lines) {
            System.out.println(t.line + " " + t.type);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
