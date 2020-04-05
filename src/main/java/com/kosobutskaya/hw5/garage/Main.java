package com.kosobutskaya.hw5.garage;

public class Main {
    public static void main(String[] args) {
        Man veronika = new Man ();
        veronika.setName("Veronika");
        Car bmw = new Car ();
        bmw.setName("bmw");
        Car porsche = new Car();
        porsche.setName("porsche");
        porsche.setGasTank(new GasTank()); // проинициализировали поле GasTank объектом GasTank
        porsche.getGasTank();
        veronika.buy(bmw);
        veronika.buy(porsche);
        porsche.fillUp(new Gas()); // вызвали метод fillUp и передали ему созданный объект Gas
        porsche.setLock(new Lock());

        porsche.open(new Key());

        Alarm alarm = new Alarm();
        alarm.makeNoise();


        veronika.drive(porsche, "Paris");

 //       System.out.println(Arrays.toString(veronika.getCars())); // распечатать массив
    }
}
