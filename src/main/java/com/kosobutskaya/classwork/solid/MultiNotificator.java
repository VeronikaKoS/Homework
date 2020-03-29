package com.kosobutskaya.classwork.solid;

public class MultiNotificator implements INotificator{
    private INotificator [] notificators;

    public MultiNotificator (INotificator [] notificators){
        this.notificators = notificators;
    }

    public void notify (Order order){
        for (INotificator notificator : notificators) {
            notificator.notify(order);
        }

    }

}
