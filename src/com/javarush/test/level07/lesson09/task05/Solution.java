package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String str = scanner.nextLine();
            arrayList.add(str);
        }
        //read strings and init ArrayList list here - считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> result = doubleValues(arrayList);

        //print result - вывести на экран result
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }

            }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++)
        {
            list.add(i, list.get(i));
            i++;

        }
        return list;
    }
}
