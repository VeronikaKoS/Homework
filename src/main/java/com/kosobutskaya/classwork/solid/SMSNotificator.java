package com.kosobutskaya.classwork.solid;

public class SMSNotificator implements  INotificator{
    public void notify (Order order){
        System.out.println(String.format("Пришел новый заказ от %s на товар: %s, по адресу %s"  , order.getCustomer(), order.getItem(), order.getNumber(), order.getAddress()));
    }
}
