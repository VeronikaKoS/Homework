package com.kosobutskaya.hw4;

public enum Country implements ICountry {
//  написали эл-ты энама и проинициализировали:
    BELARUS(200, 356783),
    GERMANY(300, 47559),
    ITALY(454, -100),
    SPAIN(546, 7575),
    USA(565656, 99999999),
    GREAT_BRITAIN(272, 5656656565L),
    SLOVAKIA(12, 4545454),
    POLAND(3, -7777),
    FRANCE(23, 56565656),
    INDIA(+6454, 67676);

    public double square;
    public long citizenCount;

//    проинициализировать через конструктор:
    Country (double square, long citizenCount){
        this.square = square;
        this.citizenCount = citizenCount;
    }


    @Override
    public double getSquare() {
        return square;
    }

    @Override
    public long getCitizenCount() {
        return citizenCount;
    }


}
