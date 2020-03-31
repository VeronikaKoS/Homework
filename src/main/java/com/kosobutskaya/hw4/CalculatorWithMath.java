package com.kosobutskaya.hw4;

public class CalculatorWithMath implements ICalculator {

    @Override
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
        return Math.pow(x, y);
    }

    @Override
    public double abs(double x) {
        return Math.abs(x);
    }

    @Override
    public double sqrt(double x) {
        return Math.sqrt(x);
    }
}
