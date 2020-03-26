package com.kosobutskaya.hw3.codingbat.warmup_1;

public class Warmup_1 {

    public static void main(String[] args) {
//        создать объект для вызова методов new Warmup_1();
//        вызываем метод у объект .nearHundred(90) со значением 90;
        new Warmup_1().nearHundred(90);
        boolean result = new Warmup_1().nearHundred(90);
        System.out.println(result);

//        сделаем цикл: for (блок инициализации; блок условия продолжения цикла; блок инкрментации/декрементации)
        for (int i = 10; (i < 200); i++){
            new Warmup_1().nearHundred(i);
            boolean rest = new Warmup_1().nearHundred(i);
            System.out.println(i + " " +  rest);
        }
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    // вернуть абсолютную разницу между n и 21, кроме случаев когда n>21, в этих случаях возвращать удвоенную абсолютную разницу
    public int diff21(int n) {
    if (n > 21) return (n - 21) * 2;
    else return (21 - n);
    }

    public boolean nearHundred (int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }


}
