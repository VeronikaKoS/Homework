package com.kosobutskaya.hw4;

public class Main {
    public static void main(String[] args) {
        Country belarus = Country.valueOf("BELARUS");
        System.out.println(belarus);

        boolean T = Country.BELARUS == belarus;
        System.out.println(T);

        boolean T2 = Country.INDIA == belarus;
        System.out.println(T2);

//        Country india = Country.valueOf("have no country");
//        System.out.println(india);

        int resultOfCompare = belarus.compareTo(Country.INDIA);
//      int resultOfCompare = Country.BELARUS.compareTo(Country.INDIA);
        System.out.println(resultOfCompare);

        Country.INDIA.compareTo(Country.BELARUS);
        System.out.println(Country.INDIA.compareTo(Country.BELARUS));
    }

}
