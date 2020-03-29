package com.kosobutskaya.hw4;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        return Double.compare(o1.getSquare(), o2.getSquare());
    }
}
