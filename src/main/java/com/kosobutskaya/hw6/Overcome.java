package com.kosobutskaya.hw6;

import java.util.Scanner;

public class Overcome {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);

        int attempts = 3; // изначально 3 попытки
        do {

            System.out.print("Sent a number from 1 to 10 ");
            String s = print.nextLine(); // метод nextLine возвращает строку, поэтому тип пер-ной s String

            attempts--; // дикрементируй

            try {
                int y = Integer.parseInt(s); // метод parseInt преобразует строку в число( достает число из строки)
                if (y >= 1 && y <= 10) {
                    System.out.println(y + " is accepted");
                    break;
                } else {
                    System.out.println("Please, input the from 1 to 10, the " + attempts + " attempts are left");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, input just a number, the " + attempts + " attempts are left");
            }

        } while (attempts > 0); // пока не станет 0


    }
}
