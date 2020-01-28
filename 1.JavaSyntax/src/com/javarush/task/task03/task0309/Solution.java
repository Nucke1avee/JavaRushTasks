package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        sum(5);
    }

    static void sum(int i){
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += j + 1;
            System.out.println(sum);
        }
    }

}
