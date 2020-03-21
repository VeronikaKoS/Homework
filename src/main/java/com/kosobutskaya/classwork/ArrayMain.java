package com.kosobutskaya.classwork;

import java.util.Arrays;
import java.util.Random;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println("initial arr:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
        System.out.println("new arr:");

        System.out.println(Arrays.toString(arr));
    }
}
