package com.kosobutskaya;

public class ColorTest {

    public static void main(String[] args) {
        for (int i = -5; i < 10; i++) { // условие цикла начинай с -5 и увеличивай на 1 пока значение меньше 10
            Color c = new Color(i);
            System.out.println(c.getNumber() + " " + c.getName());
        }
    }
}
