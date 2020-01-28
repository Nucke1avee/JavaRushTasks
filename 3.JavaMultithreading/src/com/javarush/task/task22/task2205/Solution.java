package com.javarush.task.task22.task2205;

/* 
МНЕ нравится курс JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }
    public static String getFormattedString() {
        return "%3$S %4$s %2$s %1$s" ;

        /*% = активируем режим
        3 = позиция аргумента в строке которую хотим на выходе использовать
        $ = даем это понять что именно позицию берем
        S = строка (toUpperCase) */
    }
}
