package com.kosobutskaya.hw4;

public class CalcWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calc = new CalculatorWithCounter(new CalculatorWithMath());

        calc.add(2,3);
        System.out.println(calc.getOperationCount());

        calc.add(2,3);
        calc.abs(4);
        System.out.println(calc.getOperationCount());
    }
}
