package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            int ch = scanner.nextInt();
            arrayList.add(ch);
        }


        System.out.println(max(arrayList));
        System.out.println(min(arrayList));
    }

    public static int max(ArrayList<Integer> list)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }

    public static int min(ArrayList<Integer> list)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) < min)
                min = list.get(i);
        }
        return min;
    }
}
