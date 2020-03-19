package com.kosobutskaya;

import java.util.Scanner; // импортируем класс Scaner из папки java.until

public class WorkWithConsoleInput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
// для создания объекта класса Scanner в его конструктор передается объект System.in;
// new - оператор, который создает объект Scanner;

        System.out.print("Input a name:"); //приглашение к вводу
        String name = in.nextLine();
//в переменную name получаем вводимую строку с помощью метода nextLine();

        String s = name.toLowerCase();
//        executionViaSetOfConditionsWithElse(s);
//        executionViaSwitchStatement(s);
        executionViaSetOfPureConditions(s);
    }

    private static void executionViaSetOfPureConditions(String s) {
        if (s.equals("вася")) {
            System.out.println("Привет" + "\n" + "Я тебя так долго ждал");
        }
        if (s.equals("анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!s.equals("вася") && !s.equals("анастасия")) {
            System.out.println("Добрый день. А Вы кто?");
        }
    }

    private static void executionViaSetOfConditionsWithElse(String s) {
        if (s.equals("вася"))
//        equals метод возвращающий true когда объекты равны.
//        toLowerCase метод который возвращает строку где каждый символ в нижнем регистре
        {
            System.out.println("Привет" + "\n" + "Я тебя так долго ждал");
        } else if (s.equals("анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день. А Вы кто?");
        }
    }

    private static void executionViaSwitchStatement(String s) {
        switch (s) {
            case "вася": {
                System.out.println("Привет" + "\n" + "Я тебя так долго ждал");
                break;
            }
            case "анастасия": {
                System.out.println("Я тебя так долго ждал");
                break;
            }
            default: {
                System.out.println("Добрый день. А Вы кто?");
            }
        }
    }
}
