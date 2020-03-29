package com.kosobutskaya.classwork.solid;

public class Order {
    private String number;
    private String customer;
    private String item;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomer() {
        return customer;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
