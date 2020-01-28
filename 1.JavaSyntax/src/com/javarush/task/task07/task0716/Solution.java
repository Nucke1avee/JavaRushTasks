package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> res = new ArrayList<>();
        //list.get(i).contains("something");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("л") && list.get(i).contains("р")) res.add(list.get(i));
            else if (list.get(i).contains("л")) {
                res.add(list.get(i));
                res.add(list.get(i));
            } else if (list.get(i).contains("р")) ;
            else res.add(list.get(i));
        }
        return res;
    }
}