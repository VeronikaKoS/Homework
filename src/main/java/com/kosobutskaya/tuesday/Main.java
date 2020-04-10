package com.kosobutskaya.tuesday;
// Вычислить сумму элементов массива array

public class Main {
    public static void main(String[] args) {
        int[] array = new int [100];

        int value = 0;

        for (int i = 0; i < 100 ; i++) {  // используем цикл // обращаемся к каждому элементу массива
//            array[i] = i; // записываем значение переменной i в массив по индексу [i]
//            int value = array [i]; // чтение из массива array по индексу [i]

            value = value + array[i];

            System.out.println(array[i]);
        }

        System.out.println(value);





    }
}
