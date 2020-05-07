package com.kosobutskaya.hw7;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortSt {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream("Students.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            readSt(studentList, objectInputStream);
            studentList.sort(Comparator.comparing(Student::getName));
            SortSt.writeSt(studentList);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void readSt(List<Student> studentList, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            while (true) {
                Student student = (Student) objectInputStream.readObject();
                System.out.println(student);
                studentList.add(student);
            }
        } catch (EOFException i) {
            System.out.println("End of file");
        }
    }

    static void writeSt(List<Student> studentList) throws IOException {

        try
                (FileOutputStream fileOutputStream = new FileOutputStream("StudentsNew.txt");
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {

            for (Student student : studentList) {
                objectOutputStream.writeObject(student);
            }
        }

    }
}
