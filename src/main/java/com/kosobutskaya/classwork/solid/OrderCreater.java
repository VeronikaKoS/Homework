package com.kosobutskaya.classwork.solid;

public class OrderCreater {
    private static int number = 0;
    public void creater (INotificator notificator){
        Order order = new Order();
        order.setNumber("1");
        order.setCustomer("Илья");
        order.setItem("Салфетки х 1000");
        order.setAddress("Кальварийская 33");

        notificator.notify(order);
    }
}
