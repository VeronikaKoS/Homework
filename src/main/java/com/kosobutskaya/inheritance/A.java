package com.kosobutskaya.inheritance;

public class A {
    public A(){ // конструктор без аргументов (по умолчаю наследуются только конструкторы без аргументов)
        System.out.println("no arguments");
    }
    public A(String name){
        System.out.println("name "+ name);
    }

    public void start(){ // метод
        System.out.println("Start");
    }
}
