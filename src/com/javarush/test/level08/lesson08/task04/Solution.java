package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1981"));
        map.put("Путров", new Date("January 2 1982"));
        map.put("Иванов", new Date("February 3 1983"));
        map.put("Сидоров", new Date("March 4 1984"));
        map.put("Анютина", new Date("April 5 1985"));
        map.put("Пилатес", new Date("May 6 1986"));
        map.put("Винов", new Date("June 7 1987"));
        map.put("Херов", new Date("July 8 1988"));
        map.put("Писюнов", new Date("August 9 1989"));
        map.put("членов", new Date("September 10 1990"));

        //Напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while (iter.hasNext())
        {
            Map.Entry<String, Date> pair = iter.next();

            if ((pair.getValue().getMonth() > 4)  && (pair.getValue().getMonth() < 8))
            {
                iter.remove();
            }
        }

    }

}

