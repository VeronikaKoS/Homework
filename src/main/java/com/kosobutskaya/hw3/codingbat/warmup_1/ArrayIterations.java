package com.kosobutskaya.hw3.codingbat.warmup_1;

import java.util.Scanner;

public class ArrayIterations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        if (line.isEmpty()) {
            return;
        }

        String[] source = line.split(" "); // метод .split разбивает всё введённое в строке пробелами
        int[] array = new int[source.length]; // создадим массив arr длинны source.length
//int[] array = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < source.length; i++) {
            String s = source[i];
            array[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int j = 0;
        while (j < array.length){
            System.out.print(array[j] + " ");
            j++;
        }

        System.out.println();

        j = 0;
        if (array.length > 0){ // проверка, что массив не пустой
            do{
                System.out.print(array[j] + " ");
            } while (++j < array.length);
        }
        System.out.println();

        for (int value: array){
            System.out.print(value + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i += 2){
            System.out.print(array[i] + " ");
        }

        sortAscending(array);
        print(array);

    }

    public static void sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void print(int[] array){
        System.out.println();

        for (int value: array){
            System.out.print(value + " ");
        }
    }


    }
