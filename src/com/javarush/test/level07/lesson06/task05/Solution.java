package com.javarush.test.level07.lesson06.task05;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> array = arrayList13(stringArrayList());
        for (int i = 0; i < array.size(); i++)
        {
            System.out.println(array.get(i));
        }

    }

    //Создаем массив и добавляем в массив 5 строчек с клавы
    public static ArrayList<String> stringArrayList()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();


        for (int i = 0; i < 5; i++)
        {
            String str = scanner.nextLine();
            arrayList.add(str);
        }

        return arrayList;
    }

    //Удаляем последнюю строку и вставь её в начало. Повторяем 13 раз.
    public static ArrayList<String> arrayList13(ArrayList<String> array)
    {

        for (int i = 0; i < 13; i++)
        {
            array.add(0, array.get(array.size() - 1));
            array.remove(array.size() - 1);
        }
        return array;
    }

}
