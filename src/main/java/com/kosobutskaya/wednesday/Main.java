package com.kosobutskaya.wednesday;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{
                77,88,99,11
        };
        Main.delete(a, 1);

        int[] b = new int[0];
        Main.delete(b, 1);

        System.out.println(Arrays.toString(a));
    }

    // удалить элемент по индексу index из массива а,
    // эл-ты с большим индексо должны сместиться на 1 влево
    private static void delete(int[] a, int index){
        for (int i = index; i < a.length - 1 ; i++) {
//            a[1] = a[2];
            a[i] = a[i + 1];
        }
        if(a.length > 0){
            a[a.length - 1] = 0; //записать в последний элемент массива 0
        }

    }


}
