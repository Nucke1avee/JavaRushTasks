package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(summa(10));
    }

    static int summa(int i){
        int sum = 1;
        for (int j = 0; j < i; j++) {
            sum *= (j + 1);
        }
        return sum;
    }

}
