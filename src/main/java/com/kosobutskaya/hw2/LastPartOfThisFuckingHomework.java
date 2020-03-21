package com.kosobutskaya.hw2;

public class LastPartOfThisFuckingHomework {
    public static void main(String[] args) {
        CalculatorWithOperator a = new CalculatorWithOperator();
// тип переменной равен имени класса
// при присваивании экземпляра класса тип переменной - имя этого класса
// переменная а ссылается на объект класса CalculatorWithOperator
        a.multiply(15,7);
        a.divide(28,5);
        a.power(a.divide(28,5),2);
        a.add(4.1,a.multiply(15,7));
        a.add(a.add(4.1,a.multiply(15,7)),a.power(a.divide(28,5),2));
        double b = a.add(a.add(4.1,a.multiply(15,7)),a.power(a.divide(28,5),2));
//   в переменную b записываем результат вычисленного выражения
        System.out.println(b);
    }
}
