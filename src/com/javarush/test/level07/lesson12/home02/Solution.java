package com.javarush.test.level07.lesson12.home02;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i <= n; i++)
        {
            String str = scanner.nextLine();
            arrayList.add(str);
        }
        for (int i = 0; i <= m; i++)
        {
            arrayList.add(arrayList.remove(0));
//            arrayList.add(arrayList.size(), arrayList.get(0));
//            arrayList.remove(0);
        }

        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
    }
}
