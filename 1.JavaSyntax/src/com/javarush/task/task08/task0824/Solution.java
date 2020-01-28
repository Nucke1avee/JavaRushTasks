package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> testChilds = new ArrayList<>();
        Human child1 = new Human("child1", true, 24, testChilds);
        Human child2 = new Human("child2", false, 23, testChilds);
        Human child3 = new Human("child3", false, 22, testChilds);

        ArrayList<Human> childsLit = new ArrayList<>();
        childsLit.add(child1);
        childsLit.add(child2);
        childsLit.add(child3);

        Human mom = new Human("Mom", false, 56, childsLit);
        Human dad = new Human("Dad", true, 55, childsLit);

        ArrayList<Human> momIsChild = new ArrayList<>();
        momIsChild.add(mom);
        ArrayList<Human> dadIsChild = new ArrayList<>();
        dadIsChild.add(dad);

        Human grDad1 = new Human("grDad1", true, 99, momIsChild);
        Human grDad2 = new Human("grDad2", true, 98, dadIsChild);
        Human grMom1 = new Human("grMom1", false, 97, momIsChild);
        Human grMom2 = new Human("grMom2", false, 96, dadIsChild);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(mom.toString());
        System.out.println(dad.toString());
        System.out.println(grDad1.toString());
        System.out.println(grDad2.toString());
        System.out.println(grMom2.toString());
        System.out.println(grMom1.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
