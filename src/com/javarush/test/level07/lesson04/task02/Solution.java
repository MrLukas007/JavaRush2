package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] array1) throws Exception
    {
        array1 = arrayEnter();

        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[array1.length - i - 1]);
        }

    }

    public static String [] arrayEnter () throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String [] array = new String[10];
        for (int i = 0; i < 8; i++)
        {
            String str = scanner.nextLine();
            array[i] = str;
        }
        return array;
    }
}