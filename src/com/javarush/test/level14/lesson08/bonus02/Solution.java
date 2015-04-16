package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int ch1 = scanner.nextInt();
        int ch2 = scanner.nextInt();
        System.out.println(nod(ch1, ch2));
    }


    public static int nod(int min, int max){
        int nod = 0;
        if (min > max)
        {
            int temp = min;
            min = max;
            max = temp;

        }
        if (max % min == 0)
        {
            nod = min;
        } else
        {
            int ost = max % min;
            int del = min;
            while (ost != 0)
            {
                nod = ost;
                ost = del % ost;
                del = nod;
            }
        }

        return nod;
    }
}
