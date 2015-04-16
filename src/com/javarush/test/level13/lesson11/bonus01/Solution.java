package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        Scanner scanner1 = new Scanner(file);
//d:\test1.txt
        while (scanner1.hasNext()){
            arrayList.add(scanner1.nextInt());
        }

        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (arrayList.get(i)%2==0)
            System.out.println(arrayList.get(i));
        }


    }
}
