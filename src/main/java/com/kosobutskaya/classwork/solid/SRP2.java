package com.kosobutskaya.classwork.solid;

import java.util.Scanner;

public class SRP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выведите количество способов заказа");
        INotificator[] notificators = new INotificator[scanner.nextInt()];
        for (int i = 0; i < notificators.length; i++){
            System.out.println("Выберите способ доставки");
            System.out.println("1- Директору, 2 - Менеджеру ");
            INotificator notificator = null;
            switch (scanner.nextInt()){
                case 1:
                    notificator = new DirectorNotificator();
                    break;
                case 2:
                    notificator = new SMSNotificator();
                    break;
            }
             notificators[i] = notificator;

        }

        OrderCreater orderCreater = new OrderCreater();
        orderCreater.creater(new MultiNotificator(notificators));
    }
}
