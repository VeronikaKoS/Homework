package com.kosobutskaya.inheritance;

public class Starter {
    public static void main(String[] args) {
        new B();  //создадим объект класса B через конструктор

        A variable = new B("veronika"); // создадим объект класса В и поместим его в перменную variable
        // тип переменной = имени создаваемого классу | родительскому классу | а так же Object - родительский класс для всех классов

        variable.start(); // вызовем метод start у пееременной variable класса В

        Calc smartCalculator = new Calc();

        try {
            smartCalculator.sum(5, 7);
            smartCalculator.sum(-2, -8);
        } catch (NegativeArgumentException e) {
            System.out.println(e);
        }

        try {
            smartCalculator.sum(1, 2);
        } catch (NegativeArgumentException | ZeroArgumentException y) { // т.к. метод sum выбрасывает NegativeArgumentException
            System.out.println(y);
        } finally {
            System.out.println("Today is a great day");
        }


    }

}
