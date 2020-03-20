package com.kosobutskaya;

public class Color {

    private static String[] COLOR_NAMES = new String[]{ // массив строк
            "красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"
    };

    private int number; // поле number

    public Color(int number) {
//имя метода совпадает с именем класса - это конструктор; конструктор принимает аргумент int number
        this.number = number;
//        у каждого объекта поле number индивидуальное
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        if (number >= 0 && number < COLOR_NAMES.length) { // проверка выхода индекса за пределы массива
            return COLOR_NAMES[number]; // обращение к эл-ту массива по индексу number
        }
        return "неизвестно";
    }
}
