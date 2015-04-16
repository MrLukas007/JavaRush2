package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import org.omg.DynamicAny._DynStructStub;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            String str = scanner.nextLine();
            arrayList.add(arrayList.size() - i,str);
        }

        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }

    }
}
