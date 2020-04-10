package com.kosobutskaya.tuesday;

public class Main2 {
    public static void main(String[] args) {
        Cosmetics lipstick = new Cosmetics(120);
        Clothes dress = new Clothes();
        IArmani<Integer> gift = lipstick;

        System.out.println(gift.getPrise());
    }
}
