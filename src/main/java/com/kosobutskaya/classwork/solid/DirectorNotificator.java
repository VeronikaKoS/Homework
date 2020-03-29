package com.kosobutskaya.classwork.solid;

public class DirectorNotificator implements  INotificator{
    public void notify (Order order){
        System.out.println(String.format("Пришел новый заказ от %s "  , order.getCustomer()));
    }
}
