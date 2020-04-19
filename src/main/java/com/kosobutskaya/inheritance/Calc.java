package com.kosobutskaya.inheritance;

public class Calc {
    public double sum(double a, double b) throws NegativeArgumentException {

        if (a < 0) {
            throw new NegativeArgumentException("a= " + a);
        }

        if (b < 0) {
            throw new NegativeArgumentException("b= " + b);
        }

        if (a == 0) {
            throw new ZeroArgumentException("a= " + a);
        }

        if (b == 0) {
            throw new ZeroArgumentException("b= " + b);
        }



        return a + b;
    }

}
