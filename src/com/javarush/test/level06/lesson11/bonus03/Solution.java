package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++)
        {
            int ch = scanner.nextInt();
            array[i] = ch;
        }
        sort(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static int[] sort (int[] arrays){
        Arrays.sort(arrays);
    return arrays;
}
}
