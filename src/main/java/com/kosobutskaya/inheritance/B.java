package com.kosobutskaya.inheritance;

public class B extends A {
    //    т.к. по умолчаю наследуются только конструкторы без аргументов, объявим конструктор который принимаем в себя строку
    public B(String name) {
        super(name); // через super обращаемся к методам род.класса
    }

    public B(){ // как только в дочернем классе появляется конструктор принимающий в себя аргументы,
                // конструткор по умолчанию(без арг.) исчезачет. Поэтому мы его объявляем явно.
    }

    public void start (){
        super.start();
        System.out.println("Start2");
    }

}
