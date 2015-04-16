package com.javarush.test.level15.lesson12.home04;

/**
 * Created by user on 10.04.15.
 */
public class Moon implements Planet
{
    private static Moon ourInstance = new Moon();

    public static Moon getInstance()
    {
        return ourInstance;
    }

    private Moon()
    {
    }
}
