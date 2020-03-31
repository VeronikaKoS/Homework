package com.kosobutskaya.hw4;

public class CalculatorWithCounter implements ICalculator {
    private ICalculator originalCalculator;
    private int operationCount;

    public CalculatorWithCounter(ICalculator calculator) {
        originalCalculator = calculator;
        operationCount = 0;
    }

    private void onOperation() {
        operationCount++;
    }

    @Override
    public double add(double x, double y) {
        double result = originalCalculator.add(x, y);
        onOperation();
        return result;

    }

    @Override
    public double subtract(double x, double y) {
        double result = originalCalculator.subtract(x, y);
        onOperation();
        return result;
    }

    @Override
    public double multiply(double x, double y) {
        double result = originalCalculator.multiply(x, y);
        onOperation();
        return result;
    }

    @Override
    public double divide(double x, double y) {
        double result = originalCalculator.divide(x, y);
        onOperation();
        return result;
    }

    @Override
    public double power(double x, double y) {
        double result = originalCalculator.power(x, y);
        onOperation();
        return result;
    }

    @Override
    public double abs(double x) {
        double result = originalCalculator.abs(x);
        onOperation();
        return result;
    }

    @Override
    public double sqrt(double x) {
        double result = originalCalculator.sqrt(x);
        onOperation();
        return result;
    }

    public int getOperationCount() {
        return operationCount;
    }
}
