package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int[] arrayBig = new int[20];
        for (int i = 0; i < arrayBig.length; i++)
        {
            int znachenie = scanner.nextInt();
            arrayBig[i] = znachenie;
        }

        int[] arrayLit1 = new int[10];
        int[] arrayLit2 = new int[10];
        for (int i = 0; i < arrayLit1.length; i++)
        {
            arrayLit1[i] = arrayBig[i];
        }

        for (int i = 0; i < arrayLit1.length; i++)
        {
            arrayLit2[i] = arrayBig[i+10];
            System.out.println(arrayLit2[i]);
        }

    }
}
