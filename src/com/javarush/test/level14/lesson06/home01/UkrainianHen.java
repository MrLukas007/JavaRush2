package com.javarush.test.level14.lesson06.home01;

/**
 * Created by user on 01.04.15.
 */
public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 12;
    }
    public String getDescription(){
        return super.getDescription()+" Моя страна - "+ Country.UKRAINE +". Я несу " +this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
