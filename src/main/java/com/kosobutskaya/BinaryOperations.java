package com.kosobutskaya;

public class BinaryOperations {
// описываем метод с именем function:
    public static void function(int a, int b) {

// вызываем статический метод toString у класса Integer
        System.out.println("Argument 'a':" + Integer.toString(a, 2));
        System.out.println("Argument 'b':" + Integer.toString(b, 2));

// вызов статического метода toString поумолчанию выводит в десятиричной системе
        System.out.println("Argument 'a':" + Integer.toString(a));
        System.out.println("Argument 'b':" + Integer.toString(b, 10));

//создаем переменную с именем result_1 типа int и присваем ей значение равное результату операции a & b
        int result_1 = a & b;
        System.out.println("Выведи результат Побитовое AND a & b" + " " + result_1);

        int result_2 = a | b;
        System.out.println("Выведи результат Побитовое OR a | b:" + " " + result_2);

        int result_3 = a ^ b;
        System.out.println("Выведи результат Побитовое XOR a ^ b:" + " " + result_3);

        int result_4 = ~ a;
        System.out.println("Выведи результат Побитовое NOT ~ a:" + " " + result_4);

        int result_4_1 = ~ b;
        System.out.println("Выведи результат Побитовое NOT ~ b:" + " " + result_4_1);

        int result_5 = a << b;
        System.out.println("Выведи результат Сдвиг влево a << b:" + " " + result_5);

        int result_6 = a >> b;
        System.out.println("Выведи результат Сдвиг вправо a >> b:" + " " + result_6);

        int result_7 = a >>> b;
        System.out.println("Выведи результат сдвиг вправо без учёта знака a >>> b:" + " " + result_7);
    }

// запускаем код через вызов статического метода main
    public static void main(String[] args) {
// вызов метода с именем function
        function(42, 15);

    }
}