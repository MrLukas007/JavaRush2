package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
     Scanner scanner = new Scanner(System.in);
      String str = scanner.nextLine();
        Date date = new Date(str.toUpperCase() + " 1 2000");
        System.out.println(str + " is " + (date.getMonth() + 1) + " month");
    }

}
