package com.javarush.test.level14.lesson08.home09;

/**
 * Created by user on 02.04.15.
 */
public class USD extends Money
{
    @Override
    public String getCurrencyName()
    {
        return "USD";
    }

    @Override
    public double getAmount()
    {
        return super.getAmount();
    }

    public USD(double amount)
    {
        super(amount);
    }
}
