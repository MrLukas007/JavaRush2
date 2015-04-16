package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array1 = arrayInt();
        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);
        }
    }
public static int[] arrayInt ()
{
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++)
    {
        int ch = scanner.nextInt();
        array[array.length - i - 1] = ch;
    }
    return array;

}

}
