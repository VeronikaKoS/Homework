package com.kosobutskaya.hw3.codingbat.warmup_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Karantin {
    public static void main(String[] args) {
        multiplication(10);

        System.out.println(Arrays.toString(args));
//        обратимся к массиву строк args по нулевому индексу
        String arg = args[0]; // п.2.2
//        статический метод parseInt в классе Integer преобразует строку в число
        Integer.parseInt(arg);
        int x = Integer.parseInt(arg);

        System.out.println("Next level");
//        multiplication(x);

        //п. 2.3
        print(arg);
    }

    //сделаем цикл: for (блок инициализации; блок условия продолжения цикла; блок инкрментации/декрементации)
    public static void multiplication(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = 0; j <= value; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }

    public static void print(String s) {
        System.out.println("Исходное число " + s);

        int result = 1;

        for (int i = 0; i < s.length(); i++) {
// переменная s ссылается на объект класса string
// s.charAt метод кот. возвращает символ по индексу
// в переменной symbol находится значение i
            char symbol = s.charAt(i);
            int symbolAsNumber = symbol - '0';

            result = result * symbolAsNumber;
            System.out.println("работаем с " + symbolAsNumber + " и умножаем на " + (result / symbolAsNumber) + ", получаем " + result);
        }

        System.out.println("Результат умножения " +result);

    }

}
