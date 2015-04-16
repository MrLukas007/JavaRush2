package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка  с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        //Создаем массивы
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

        // Добавляем в массив arrayList 20 элементов с клавиатуры
        for (int i = 0; i < 20; i++)
        {
            int ch = scanner.nextInt();
            arrayList.add(ch);
        }

        //Сортируем элементы из массива arrayList в 3 других массива
        for (int i = 0; i < arrayList.size(); i++)
        {
            if (arrayList.get(i)%3==0 && arrayList.get(i)%2==0)
            {
                arrayList3.add(arrayList.get(i));
                arrayList2.add(arrayList.get(i));

            }
            else if (arrayList.get(i)%3==0)
            {
                arrayList3.add(arrayList.get(i));
            }
            else if (arrayList.get(i)%2==0)
            {
                arrayList2.add(arrayList.get(i));
            }
            else
            {
                arrayList1.add(arrayList.get(i));
            }
        }

        printList(arrayList3);
        printList(arrayList2);
        printList(arrayList1);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
