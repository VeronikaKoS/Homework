package com.kosobutskaya.hw7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudents {
    public static void main(String[] args) {
        try (
                FileInputStream fileInputStream = new FileInputStream("Students.txt"); // для чтения из файла
                ObjectInputStream createNewStr = new ObjectInputStream(fileInputStream);
        ) {
            Student fad = (Student) createNewStr.readObject();
            System.out.println(fad);

        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }


    }
}
