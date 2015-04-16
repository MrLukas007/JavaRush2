package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("4len1");
        stringArrayList.add("4len2");
        stringArrayList.add("4len3");
        stringArrayList.add("4len4");
        stringArrayList.add("4len5");

        System.out.println("Размерность массива равна:" + stringArrayList.size());
        for (int i = 0; i < stringArrayList.size(); i++)
        {
            System.out.println(stringArrayList.get(i));
        }
    }
}
