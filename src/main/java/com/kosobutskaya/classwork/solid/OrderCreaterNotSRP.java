package com.kosobutskaya.classwork.solid;

public class OrderCreaterNotSRP {
    public void create (){
        Order order = new Order();
        order.setNumber("1");
        order.setCustomer("Илья");
        order.setItem("Салфетки х 1000");
        order.setAddress("Кальварийская 33");

        System.out.println(String.format("Пришел новый заказ от %s на товар: %s, по адресу %s"  , order.getCustomer(), order.getItem(), order.getNumber(), order.getAddress()));
    }
}
