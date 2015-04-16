package com.javarush.test.level11.lesson11.bonus02;

/* Нужно добавить в программу новую функциональность
Добавь общий базовый класс к классам-фигур:  (фигуры из шахмат).
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class figura{
        private int x;
        private int y;
    }
    public class King extends figura
    {
    }

    public class Queen extends figura
    {
    }

    public class Rook extends figura
    {
    }

    public class Knight extends figura
    {
    }

    public class Bishop extends figura
    {
    }

    public class Pawn extends figura
    {
    }
}
