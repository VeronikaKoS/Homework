package com.kosobutskaya.weekend;

import java.util.Objects;

public class Key {
    private int serialNumber; // поле

    public Key (int serialNumber){  // объявляем конструктор, а значение аргументу serialNumber указали при вызове конструктора в Main
        this.serialNumber = serialNumber; // поле serialNumber приняло значение аргумента serialNumber
        System.out.println("Zaebalas=( " + serialNumber);
    }


    // по у молчанию у класса есть методы toString; hashCode; equals;
    @Override
    public String toString() {
        return "Key{" +
                "serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return serialNumber == key.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
       this.serialNumber = serialNumber;
    }
}
