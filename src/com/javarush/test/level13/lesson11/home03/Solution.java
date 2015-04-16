package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;
import java.util.ArrayList;


public class Solution
{
    public static void main(String[] args) throws Exception
    {

//d:\test.txt

        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream stream = new FileInputStream(fileName);
        while (stream.available() > 0) {
            System.out.print((char)stream.read());
        }
        stream.close();
        reader.close();
    }
}

