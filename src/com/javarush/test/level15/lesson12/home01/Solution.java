package com.javarush.test.level15.lesson12.home01;


import java.io.IOException;
import java.util.Scanner;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        Object str = null;
        while (true)
        {
            try
            {


                str = scanner.nextLine();
                if ("exit".equals(str))
                {
                    break;
                } else
                {
                    if (str.toString().contains("."))
                    {
                        print(Double.parseDouble((str.toString())));
                    } else if (Integer.parseInt(str.toString()) >= 128)
                    {
                        print(Integer.parseInt(str.toString()));
                    } else if (Short.parseShort(str.toString()) > 0 && Short.parseShort(str.toString()) < 128)
                    {
                        print(Short.parseShort(str.toString()));
                    } else
                        print(str.toString());
                }
            }
            catch (NumberFormatException e)
            {
                print(str.toString());
            }
        }
    }

    public static void print(Double value)
    {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value)
    {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value)
    {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value)
    {
        System.out.println("Это тип Integer, значение " + value);
    }
}
