package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Можаев", "Максим");
        hashMap.put("Решетникова", "Юля");
        hashMap.put("Ковалева", "Анастасия");
        hashMap.put("Дымченко", "Максим");
        hashMap.put("Сергеева", "Елизавета");
        hashMap.put("Проценко", "Евгений");
        hashMap.put("Поташов", "Виктор");
        hashMap.put("Лебедев", "Виктор");
        hashMap.put("Фоминых", "Екатерина");
        hashMap.put("Калмыков", "Виктор");
        return hashMap;
    }


    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> arrayList = new ArrayList<String>(map.values());
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair1 : copy.entrySet())
        {
            int count = 0;
            String value = pair1.getValue();
            count = Collections.frequency(arrayList, value);
            if (count > 1)
                removeItemFromMapByValue(map, value);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }

    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }

}
