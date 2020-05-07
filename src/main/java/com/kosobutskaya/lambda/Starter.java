package com.kosobutskaya.lambda;

import java.util.HashSet;
import java.util.Set;

public class Starter {
    public static void main(String[] args) {
        IBehavior z = new AlexBehavior();
        Person alex = new Person("Alex", z);
        Person veronika = new Person("Veronika", phrase -> { // lambda - реализация ф-ного интерфейса
            return "YES";
        });
        Person pm = new Person("Sergey Kovalenko", Starter::repeat); // передаем метод по ссылке

        Set<Person> people = new HashSet<>(); // set это коллекция
        people.add(alex);
        people.add(veronika);
        people.add(pm);
        System.out.println(people.size());

        lookAtReactions(people, "Do you want to buy bmw?");
    }

    private static void lookAtReactions(Set<Person> people, String phrase) {
        System.out.println(phrase);
        for (Person person : people) { // будем итерироваться по эл-там коллекции
            // чтобы в пер-ной person оказался каждый объект из people
            System.out.println(person.getName() + ": " + person.getBehavior().ask(phrase));
            // метод .ask(phrase) относится к объекту который был возвращен методом .getBehavior() у пер-ной person

        }
    }

    private static String repeat(String s){
        return s;
    }
}
