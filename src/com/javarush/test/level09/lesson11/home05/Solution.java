package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ArrayList<Character> arrayList1 = new ArrayList<Character>();
        ArrayList<Character> arrayList2 = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            if (isVowel(str.charAt(i)))
                arrayList1.add(str.charAt(i));
            else if (str.charAt(i) == ' ')
                continue;
           else
                arrayList2.add(str.charAt(i));
        }
        for (int i = 0; i < arrayList1.size(); i++)
        {
            System.out.print(arrayList1.get(i).toString() + " ");

        }
        System.out.println();
        for (int i = 0; i < arrayList2.size(); i++)
        {
            System.out.print(arrayList2.get(i).toString() + " ");

        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
