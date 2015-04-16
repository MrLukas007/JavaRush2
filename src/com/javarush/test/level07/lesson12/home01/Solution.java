package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            int ch = scanner.nextInt();
            integerArrayList.add(ch);
        }
        for (int i = 0; i < integerArrayList.size(); i++)
        {
            System.out.println(integerArrayList.get(integerArrayList.size() - i - 1));
        }
    }
}
