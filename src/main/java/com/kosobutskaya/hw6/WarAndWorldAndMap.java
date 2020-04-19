package com.kosobutskaya.hw6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class WarAndWorldAndMap {
    public static void main(String[] args) {
        String text = readAllBytesJava7("C:/Users/Veronika/Downloads/WarAndWorld.txt");
        String[] words = text.toLowerCase().split(" ");

        java.util.Map<String, Integer> map = new HashMap<>();

        for (String word : words) {

            word = clean(word);
            Integer count = map.get(word); //метод get по ключу получает значени
//            System.out.println(count);
            if (map.containsKey(word)) {
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        print(map, "война", "и", "мир");
    }

    private static void print(java.util.Map<String, Integer> map, String... words){
        for (int i = 0; i < words.length; i++) {
           String word =  words[i];
            System.out.println(word + " встречается " + map.get(word) );
        }
    }

    private static String clean(String s) {
        s = s.replace(",", "");
        s = s.replace(".", "");
        s = s.replace("/", "");
        s = s.replace(";", "");
        s = s.replace("\n", "");
        s = s.replace("\"", "");
        s = s.replace("!", "");
        s = s.replace(")", "");
        s = s.replace("(", "");
        s = s.replace("*", "");
        s = s.replace("=", "");
        return s.replace("?", "");
    }


    private static String readAllBytesJava7(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}



