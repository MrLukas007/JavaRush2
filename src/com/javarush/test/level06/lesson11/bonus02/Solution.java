package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGran = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat catGram = new Cat(grandmaName);

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName, catGran, null);

        String momName = reader.readLine();
        Cat catMom = new Cat(momName, null, catGram);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catDad, catMom);

        String datName = reader.readLine();
        Cat catDat = new Cat(datName, catDad, catMom);

        System.out.println(catGran);
        System.out.println(catGram);

        System.out.println(catDad);
        System.out.println(catMom);

        System.out.println(catSon);
        System.out.println(catDat);
    }

    public static class Cat
    {
        private String name;
        private Cat mom;
        private Cat dad;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat dad, Cat mom){
            this.name = name;
            this.mom = mom;
            this.dad = dad;

        }

        @Override
        public String toString()
        {
            if ((dad == null)&&(mom == null))
                return "Cat name is " + name + ", no mother" + ", no father";
            if(dad == null)
                return "Cat name is " + name + ", mother is " + mom.name + ", no father";
            if(mom == null)
                return "Cat name is " + name + ", no mother" + ", father is " + dad.name;
            return "Cat name is " + name + ", mother is " + mom.name + ", father is " + dad.name;
        }
    }

}

