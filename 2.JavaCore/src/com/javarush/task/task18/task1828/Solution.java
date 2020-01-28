package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> fLines = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fName = reader.readLine();
            reader.close();
            BufferedReader fReader = new BufferedReader(new InputStreamReader(new FileInputStream(fName), "cp1251"));
            String line = fReader.readLine();
            while (line != null ) {
                fLines.add(line);
                line = fReader.readLine();
            }
            fReader.close();
            if (args.length == 5 && args[0].equals("-u")) update(fLines, args, fName);
            else if (args.length == 2 && args[0].equals("-d")) delete(fLines, args, fName);
        }
        catch (FileNotFoundException e) {
        }
        catch (IOException e) {
        }
    }

    private static void update(ArrayList<String> fLines, String[] args, String fName) throws IOException {
        OutputStreamWriter fWriter = new OutputStreamWriter(new FileOutputStream(fName, false));
        int argsLength = args.length;
        String id = String.format("%-8s", args[1]);
        //String name = "";
        //for (int i = 2; i < argsLength - 2; i++) name += args[i] + " "; // для случая, если название не в ковычках и содержит несколько слов
        float price = Math.round(Float.parseFloat(args[argsLength - 2]) * 100) / 100.0f;
        String result = String.format(Locale.ENGLISH, "%-8.8s%-30.30s%-8.2f%-4.4s", args[1], args[2], price, args[4]);
        for (String line : fLines) {
            if (fLines.indexOf(line) != 0) fWriter.write("\n");
            if (line.substring(0,8).equals(id)) {
                fWriter.write(result);
                continue;
            }
            fWriter.write(line);
        }
        fWriter.flush();
        fWriter.close();
    }

    private static void delete(ArrayList<String> fLines, String[] args, String fName) throws IOException {
        String id = String.format("%-8s", args[1]);
        FileWriter fWriter = new FileWriter(fName, false);
        for (String line : fLines) {
            if (line.substring(0, 8).equals(id)) continue;
            if (fLines.indexOf(line) != 0) fWriter.write("\n");
            fWriter.write(line);
        }
        fWriter.flush();
        fWriter.close();
    }
}

