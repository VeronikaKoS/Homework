package com.kosobutskaya.iter;

import java.util.HashSet;
import java.util.Set;

public class SetMain2 {
    public static void main(String[] args) {
        Set<Passport> data = new HashSet<>();

        data.add(new Passport("123456789", "Veronika", 24));
        data.add(new Passport("123456789", "Veronika", 24));
        data.add(new Passport("123456789", "Veronika", 24));
        data.add(new Passport("123456789", "Veronika", 24));
        data.add(new Passport("176543289", "Lesha", 27));
        data.add(new Passport("0987654321", "Roma", 71));

        for (Passport item : data){
            System.out.println(item);
        }

    }
}
