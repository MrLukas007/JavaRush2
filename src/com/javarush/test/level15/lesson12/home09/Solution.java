package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String url = scanner.nextLine();
		String fullUrl = url;
		ArrayList<String> arrayList = new ArrayList<String>();
		int nachalo = 0;
		String subString = null;

		while (url.contains("=")) {
			if (url.contains("?")) {
				nachalo = url.indexOf('?');
			} else if (url.contains("&")) {
				nachalo = url.indexOf('&');
			}
			subString = url.substring(nachalo + 1, url.indexOf('='));
			if (subString.contains("&")) {
				arrayList.add(subString.substring(0, subString.indexOf('&')));
				arrayList.add(subString.substring(subString.indexOf('&') + 1));

			} else {
				arrayList.add(subString);
			}

			url = url.substring(url.indexOf('=') + 1);
		}

		for (int i = 0; i < arrayList.size()-1; i++) {
			System.out.print(arrayList.get(i) + " ");
		}
        System.out.print(arrayList.get(arrayList.size() - 1));

		System.out.println();

		nachalo = fullUrl.indexOf('?') + 1;

// javarush.ru/alpha/index.html?lvl=15&view&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&oobj=3.0&obj=1&obj=2.3&obj=aa  
		String str = null;
		while (fullUrl.substring(nachalo).contains("&obj=") || fullUrl.substring(nachalo).contains("?obj=")) {
			nachalo = 0;
            if (fullUrl.substring(nachalo).contains("&obj=")){
			fullUrl = fullUrl.substring(fullUrl.indexOf("&obj=") + 1);}
            else if (fullUrl.substring(nachalo).contains("?obj="))
            {
                fullUrl = fullUrl.substring(fullUrl.indexOf("?obj=") + 1);
            }

			if (fullUrl.contains("&")) {
				str = fullUrl.substring(4, fullUrl.indexOf('&'));
			} else {
				str = fullUrl.substring(4);
			}
			if (str.contains(".")) {
				alert(Double.parseDouble(str));
			} else {
				alert(str);
			}
		}
	}


	public static void alert(double value) {
		System.out.println("double " + value);
	}

	public static void alert(String value) {
		System.out.println("String " + value);
	}
}
