package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
        isDateOdd("MAY 1 2013");
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        DateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFormat.parse(date));
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        return (day % 2 != 0);


    }
}
