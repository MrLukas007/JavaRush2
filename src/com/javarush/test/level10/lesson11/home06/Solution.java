package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private String hair;
        private int weight;
        private int tail;

        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, int age, boolean sex, String hair){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hair = hair;

        }
        public Human(String name, int age, boolean sex, String hair, int weight){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hair = hair;
            this.weight = weight;
        }
        public Human(String name, int age, boolean sex, String hair, int weight, int tail){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.hair = hair;
            this.weight = weight;
            this.tail = tail;
        }
        public Human(String name, boolean sex, String hair, int weight, int tail){
            this.name = name;
            this.sex = sex;
            this.hair = hair;
            this.weight = weight;
            this.tail = tail;
        }
        public Human(int age, boolean sex, String hair, int weight, int tail){
            this.age = age;
            this.sex = sex;
            this.hair = hair;
            this.weight = weight;
            this.tail = tail;

    }
        public Human(boolean sex, String hair, int weight, int tail){
            this.sex = sex;
            this.hair = hair;
            this.weight = weight;
            this.tail = tail;
}
        public Human(String hair, int weight, int tail){

            this.hair = hair;
            this.weight = weight;
            this.tail = tail;
        }
    }
}
