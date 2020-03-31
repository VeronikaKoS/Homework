package com.kosobutskaya.hw2;

import com.kosobutskaya.hw4.ICalculator;

/**
 * тип параметров и результатов double потому что:
 * позволяет хранить вещественные числа
 * и обладает двойной точностью в сравнении с float;
 */
public class CalculatorWithOperator implements ICalculator {

    @Override
   /* анноация @Override используется над методами в классах, которые были описаны
    в интерфейсах или наследуемых классах, для отображания связи с другими абстракциями
   */

    public double add(double x, double y) {
        return x + y;
    }
    @Override
    public double subtract(double x, double y) {
        return x - y;
    }
    @Override
    public double multiply(double x, double y) {
        return x * y;
    }
    @Override
    public double divide(double x, double y) {
        return x / y;
    }
    @Override
    public double power(double x, double y) {
//        есть класс Math, в нем есть статический метод pow
//        принимающий 2 аргумента: основание и степень;
        return Math.pow(x, y);
    }
    @Override
    public double abs(double x) {
        if (x < 0) return -x;
        else return x;
    }
    @Override
    public double sqrt(double x) {
        return Math.sqrt(x);
    }

}
