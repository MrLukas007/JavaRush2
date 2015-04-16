package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Mawa", "Sidorova");
        hashMap.put("Rita", "Petrova");
        hashMap.put("Miwa", "Travnik");
        hashMap.put("Kewa", "Poobewa");
        hashMap.put("Griwa", "Krotuk");
        hashMap.put("Dima", "Mizin");
        hashMap.put("Artem", "Rustamov");
        hashMap.put("Sawa", "Korotkov");
        hashMap.put("Sawa", "Sidorova");
        hashMap.put("Elvira", "Ring");
        hashMap.put("Prezent", "Buliavec");
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            String value = entry.getValue();
            if (name.equals(value))
                count++;

        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            String key = entry.getKey();
            if (familiya.equals(key))
                count++;
        }
        return count;
    }

}
