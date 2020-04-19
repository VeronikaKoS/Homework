package com.kosobutskaya.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain1 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(5);
        data.add(17);
        data.add(28);

        System.out.println("___foreach___");
        for (Integer item : data) { // проитерировать данные способ 1
            System.out.println(item);
        }

        System.out.println("___fori___");
        for (int i = 0; i < data.size(); i++) { // проитерировать данные способ 2
            System.out.println(data.get(i));
        }

        System.out.println("___iterator___");
        Iterator<Integer> itr = data.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        System.out.println("___fail test___");
//        System.out.println(data.get(9999));
//        System.out.println(itr.next());

        System.out.println("____ test___");
        Iterator<Integer> itr2 = data.iterator();

        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
