package com.javarush.test.level07.lesson06.task04;

/* 5 строчек в начало списка
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

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
            arrayList.add(0 ,str);
        }
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
    }
}
