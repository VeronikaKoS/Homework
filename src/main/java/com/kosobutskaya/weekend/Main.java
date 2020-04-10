package com.kosobutskaya.weekend;

public class Main {
    public static void main(String[] args) {

        Key key1 = null; // объявили переменную key1 типа Key
        System.out.println(key1);

        key1 = new Key(9); // обращаемся к переменной key1; создаем новый объект класса Key через вызов конструктора Key()
        System.out.println(key1); // вызов конструктора Key() должен принимать аргументы заданные при его объявлении(создании)

        key1.setSerialNumber(8); // полю serialNumber (в объекте new Key) присвоено значение 8
        System.out.println(key1);

        Key x = key1; // объвить переменную х типа Key и поместить в нее переменную key1; теперь x = new Key
        System.out.println(x);

        Key key2 = new Key(12); // в переменной key2 которая ссылается на объект new Key() по умолчанию 0 т.к. поле serialNumber интовое
        System.out.println(key2);
    }
}
