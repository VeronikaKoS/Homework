package com.kosobutskaya.inheritance;

public class ZeroArgumentException extends RuntimeException {

    public ZeroArgumentException(String s){
        super(s);  // вызываем конструктор объявленый в классе RuntimeException и передаем туда строку
    }


}
