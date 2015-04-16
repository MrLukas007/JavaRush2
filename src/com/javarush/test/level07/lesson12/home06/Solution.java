package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
       Human ded1 = new Human("Vasia", true, 92);
       Human ded2 = new Human("Petia", true, 89);
       Human babka1 = new Human("Tonia", false, 70);
       Human babka2 = new Human("Katia", false, 80);
       Human papa = new Human("Vitia", true, 40, ded1, babka1);
       Human mama = new Human("Ira", false, 45, ded2, babka2);
       Human child1 = new Human("Dima", true, 20, papa, mama);
       Human child2 = new Human("Lewa", true, 22, papa, mama);
       Human child3 = new Human("Sveta", false, 18, papa, mama);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
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
        public Human(String name, boolean sex, int age, Human father, Human mother)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }
        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
    }

}
