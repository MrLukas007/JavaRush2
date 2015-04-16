package com.javarush.test.level14.lesson08.home09;

/**
 * Created by user on 02.04.15.
 */
public class Hrivna extends Money
{
    @Override
    public double getAmount()
    {
        return super.getAmount();
    }

    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }

    public Hrivna(double amount)
    {
        super(amount);
    }

}
