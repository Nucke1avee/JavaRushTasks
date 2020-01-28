package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private String address;
        private int age;
        private String phone;
        private boolean sex;

        public Human(int age, String phone, boolean sex) {
            this.age = age;
            this.phone = phone;
            this.sex = sex;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String phone) {
            this.firstName = firstName;
            this.phone = phone;
        }

        public Human(String address, int age, String phone, boolean sex) {
            this.address = address;
            this.age = age;
            this.phone = phone;
            this.sex = sex;
        }

        public Human(String lastName, String address, int age, String phone, boolean sex) {
            this.lastName = lastName;
            this.address = address;
            this.age = age;
            this.phone = phone;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, String address, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.age = age;
        }

        public Human(String firstName, String lastName, String address, int age, String phone) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.age = age;
            this.phone = phone;
        }

        public Human(String firstName, String lastName, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }

        public Human(String firstName, String lastName, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, String address, int age, String phone, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.age = age;
            this.phone = phone;
            this.sex = sex;
        }
    }
}
