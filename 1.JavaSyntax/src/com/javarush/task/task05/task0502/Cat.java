package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        double s1 = (this.weight * this.strength) / this.age;
        double s2 = (anotherCat.weight * anotherCat.strength) / anotherCat.age;

        if (s1 > s2) return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}
