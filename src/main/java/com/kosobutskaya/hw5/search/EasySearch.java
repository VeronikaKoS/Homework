package com.kosobutskaya.hw5.search;

public class EasySearch implements ISearchEngine {

    @Override
    public int search(String[] array, String word) {
        int count = 0;

        for (String s : array) { // в пер-ной s будет каждый эл-т массива array
            for (int i = 0; i < s.length() && i != -1; ) {
//т.к метод indexOf находит только первое вхождение искомого эл-та в строку используем цикл
// i это индекс с которого будет искаться строчка word
                i = s.indexOf(word, i); // в i помещаем позицию в кот. находится строка word в строке s
                if (i != -1) { // найдено
                    count++;
                    i = i + word.length(); //ищи с новой позиции(индекса), а не след.символа
                }
            }

        }

        return count;
    }
}
