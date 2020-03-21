package com.kosobutskaya.hw2;

/**
 * тип параметров и результатов double потому что:
 * позволяет хранить вещественные числа
 * и обладает двойной точностью в сравнении с float;
 */
public class CalculatorWithOperator {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

    public double power(double x, double y) {
//        есть класс Math, в нем есть статический метод pow
//        принимающий 2 аргумента: основание и степень;
        return Math.pow(x, y);
    }

    public double abs(double x) {
        if (x < 0) return -x;
        else return x;
    }

    public double sqrt(double x) {
        return Math.sqrt(x);
    }

}
