package com.kosobutskaya.tuesday;

public class Main1 {
    public static void main(String[] args) {
        int summa = 0;
        for (int i = 0; i < 4; i++) {
            summa = summa + i;
        }
        System.out.println(summa);

//        int[] massiv = new int [4];
//        massiv [0] = 9;
//        massiv [1] = 8;
//        massiv [2] = 5;
//        massiv [3] = -3;


        int[] massiv = new int[]{
                9, 8, 5, -3
        };

        System.out.println(sum(massiv));

//когда значения переменных передаются копированием, а не ссылкой
        int a = 7;
        int b = a;
        a = 8; // b =7
    }

    //напишем метод для массива который суммирует все эл-ты массива
    private static int sum(int[] array) { // имя агрумента array, тип - массив
        int lunch = 0;
        for (int i = 0; i < array.length; i++) {
            lunch = lunch + array[i];
        }
        return lunch; // в переменной ланч хранится сумма всех эл-тов массива
    }

}
