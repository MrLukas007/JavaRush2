package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            String str = scanner.nextLine();
            arrayList.add(str);
        }
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(arrayList.size()-i-1));
        }

    }
}
