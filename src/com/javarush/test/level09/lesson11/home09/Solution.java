package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();

        Cat cat1 = new Cat("Pipenec1");
        Cat cat2 = new Cat("Pipenec2");
        Cat cat3 = new Cat("Pipenec3");
        Cat cat4 = new Cat("Pipenec4");
        Cat cat5 = new Cat("Pipenec5");
        Cat cat6= new Cat("Pipenec6");
        Cat cat7= new Cat("Pipenec7");
        Cat cat8 = new Cat("Pipenec8");
        Cat cat9 = new Cat("Pipenec9");
        Cat cat10 = new Cat("Pipenec10");

        map.put("Murzik1", cat1);
        map.put("Murzik2", cat2);
        map.put("Murzik3", cat3);
        map.put("Murzik4", cat4);
        map.put("Murzik5", cat5);
        map.put("Murzik6", cat6);
        map.put("Murzik7", cat7);
        map.put("Murzik8", cat8);
        map.put("Murzik9", cat9);
        map.put("Murzik10", cat10);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> cats = new HashSet<Cat>();
        for(Map.Entry<String, Cat> catEntry: map.entrySet()){
            cats.add(catEntry.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
