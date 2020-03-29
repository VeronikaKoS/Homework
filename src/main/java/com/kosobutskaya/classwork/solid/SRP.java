package com.kosobutskaya.classwork.solid;

public class SRP {
    public static void main(String[] args) {
        OrderCreaterNotSRP orderCreater = new OrderCreaterNotSRP();
        orderCreater.create();
    }
}
