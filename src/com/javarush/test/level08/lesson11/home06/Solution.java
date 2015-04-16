package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<Human>();
        Human rebenok1 = new Human("Vasia", true, 12);
        Human rebenok2 = new Human("Gera", false, 15);
        Human rebenok3 = new Human("Vita", false, 17);
        children.add(rebenok1);
        children.add(rebenok2);
        children.add(rebenok3);
        Human father = new Human("папа Василь", true, 65, children);
        Human mother = new Human("мама Низабудка", false, 65, children);
        ArrayList<Human> children1 = new ArrayList<Human>();
        children1.add(father);
        children1.add(mother);

        Human grandf = new Human("дедушка Вася", true, 80, children1);
        Human grandf2 = new Human("дедушка Данил", true, 80, children1);

        Human grandm = new Human("бабушка Анастасия", false, 56, children1);
        Human grandm2 = new Human("бабушка Гармония", false, 56, children1);

        System.out.println(rebenok1);
        System.out.println(rebenok2);
        System.out.println(rebenok3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandf);
        System.out.println(grandf2);

        System.out.println(grandm);
        System.out.println(grandm2);




         }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;


        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
