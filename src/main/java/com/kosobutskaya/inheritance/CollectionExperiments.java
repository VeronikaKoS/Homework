package com.kosobutskaya.inheritance;

import java.util.ArrayList;
import java.util.List;

public class CollectionExperiments {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(); // объявили переменную а типа List и присваиваем ей объект класса ArrayList

        System.out.println(a.isEmpty());
        a.add(5);
        a.remove(Integer.valueOf(5)); // у класса Integer вызвали метов valueOf
        System.out.println(a);
        a.add(6);
        System.out.println(a.size());
    }
}
