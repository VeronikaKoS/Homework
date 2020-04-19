package com.kosobutskaya.iter;

import java.util.HashSet;
import java.util.Set;

public class SetMain1 {
    private static String item;

    public static void main(String[] args) {
        Set<String> data = new HashSet<>();

        data.add("A");
        data.add("B");
        data.add("Z");
        data.add("D");

        System.out.println("_____step1____");
        for (String item: data);
        System.out.println(item);

//        System.out.println("_____step2____");
//        for (String )

    }
}
