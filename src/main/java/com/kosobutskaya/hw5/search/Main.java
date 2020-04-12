package com.kosobutskaya.hw5.search;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        ISearchEngine search = new EasySearch();
        Path path = Paths.get("C:\\Users\\Veronika\\IdeaProjects\\temp\\src\\main\\resources\\WarAndWorld.txt"); // метод get у класа Paths возвращает объект класса Path (ПУТЬ К ФАЙЛУ)
        byte[] massivByte= Files.readAllBytes(path); // обращаемся к методу readAllBytes у класса Files, а в аргументе указать объект класса Path

        String s = new String(massivByte); // создать объект String из массива massivByte через конструктор
        String[] array = new String[]{
            s
        };

        System.out.println(search.search(array, "война"));
        System.out.println(search.search(array, "и"));
        System.out.println(search.search(array, "мир"));
    }
}
