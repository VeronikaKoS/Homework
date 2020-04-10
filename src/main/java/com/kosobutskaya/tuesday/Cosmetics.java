package com.kosobutskaya.tuesday;

public class Cosmetics implements IArmani <Integer> {
    private final int price;
    public Cosmetics(int price){
        this.price = price;
    }


    @Override
    public Integer getPrise() {
        return price;
    }
}
