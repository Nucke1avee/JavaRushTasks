package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grDad1 = new Human("grDad1", true, 77);
        Human grDad2 = new Human("grDad2", true, 88);
        Human grMom1 = new Human("grMom1", false, 73);
        Human grMom2 = new Human("grMom2", false, 83);
        Human mom = new Human("mom", false, 33, grDad1, grMom1);
        Human dad = new Human("dad", true, 43, grDad2, grMom2);
        Human child1 = new Human("child1", true, 17, dad, mom);
        Human child2 = new Human("child2", false, 11, dad, mom);
        Human child3 = new Human("child3", false, 13, dad, mom);

        System.out.println(grDad1);
        System.out.println(grDad2);
        System.out.println(grMom1);
        System.out.println(grMom2);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















