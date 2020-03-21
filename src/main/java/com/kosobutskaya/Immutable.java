package com.kosobutskaya;

public class Immutable {
    // объект cat помещается в string pool
    // если они созданы через литерал объекты в памяти будут одинаковые
    // если идет сравнение 2ух ссылочных переменных
    // cat3.equal(cat1) у объекта кэт3 вызывается метод предназначенный для сравнения кэт1

    public static void main(String[] args)
    {
        System.out.println("Задание 1.1:\n");
        String str1 = "Мама мыла раму";
        String str2 = "Мама" + " мыла " + "раму";
        System.out.println("str1 == str2: " + str1 == str2+ "\n");
        System.out.println("str1 == str2: " + str1.intern() == str2+ "\n");
        System.out.println("str1 == str2: " + str1 == str2+ "\n");
    }

}
