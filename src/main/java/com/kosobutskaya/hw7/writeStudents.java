package com.kosobutskaya.hw7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class writeStudents {
    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream fileStream = new FileOutputStream("Students.txt"); // для записи в файл
                ObjectOutputStream createNewSt = new ObjectOutputStream(fileStream);
        ) {

//            Student mark = new Student();
//            mark.setName("Mark");
//            mark.setSurname("Alien");
//            createNewSt.writeObject(mark);

          List<Student> people= generateStudent();
          for (Student d: people){
              createNewSt.writeObject(d);
          }

        }

    }

    private static List<Student> generateStudent() {
        List<String> names = Arrays.asList(
                "James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph",
                "Thomas", "Charles", "Christopher", "Daniel", "Mary", "Patricia", "Jennifer",
                "Linda", "Elizabeth", "Barbara", "Susan", "Jessica", "Sarah", "Karen"
        );


        List<String> surnames = Arrays.asList(
                "Adams",
                "Allen", "Anderson", "Armstrong", "Atkinson", "Bailey", "Baker", "Ball", "Barker",
                "Barnes", "Bell", "Bennett", "Booth", "Bradley", "Brooks", "Brown", "Burton"
        );

        List<Student> students = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String name = names.get(random.nextInt(names.size()));
            // names.size() рандом не вернет невалидного значения, кот. не будет в списке

            String surname = surnames.get(random.nextInt(surnames.size()));

            Student s = new Student();
            s.setName(name);
            s.setSurname(surname);
            System.out.println(s);

            students.add(s);
        }
        return students;
    }
}
