package com.kosobutskaya.iter;

import java.util.*;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, List<String >> data = new HashMap<>();

        data.put("ruchka", Arrays.asList("I have a one pen for writing", "The door has a pen also", "The car has a pen for open the door" ));
        data.put("topor", Arrays.asList("this is a topor" ));

        List<String> list = data.get("ruchka");

        for (String s : list){
            System.out.println(s);
        }

        Set<String> strings = data.keySet();
        Collection<List<String>> values = data.values();
    }
}
