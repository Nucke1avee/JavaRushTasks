package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        reader.close();
        load(fis);
        fis.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        for (Map.Entry<String, String> m : properties.entrySet()) { //заполняем p
            p.setProperty(m.getKey(), m.getValue());
        }
        p.store(outputStream, null); //p сохраняем в properties
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties p = new Properties();
        p.load(inputStream);  //загружаем в p из inputStream'a данные
        properties.putAll((Map) p); //кладем все данные из p в Map'у (хотя так, врое, не совсем корректно)
        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
