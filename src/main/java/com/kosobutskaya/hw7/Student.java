package com.kosobutskaya.hw7;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String surname;

    // при чтении из файла будем выводить в консоль с использованием метода toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(name); // метод позволяет записывать строки в стрим
        out.writeUTF(surname);
    }

    private void readObject(ObjectInputStream input) throws IOException {
        name = input.readUTF(); // метод позволяет читать из строк
        surname = input.readUTF();

    }

}
