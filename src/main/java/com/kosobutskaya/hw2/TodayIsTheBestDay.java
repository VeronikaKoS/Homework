package com.kosobutskaya.hw2;

public class TodayIsTheBestDay {
    public static void main(String[] args) {
//        new Color(3); // это строка целиком представляет объект
           new Color(3).getName(); // вызов метода getName
           new Color(3).getNumber();
           Color green = new Color(3);

        System.out.println(green.getName() + "\n" + green.getNumber());
    }
}
