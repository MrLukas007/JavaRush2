package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by user on 14.04.15.
 */
public class Plane implements Flyable
{
    private int countPas;
    @Override
    public void fly()
    {

    }

    public Plane(int countPas)
    {
        this.countPas = countPas;
    }
}
