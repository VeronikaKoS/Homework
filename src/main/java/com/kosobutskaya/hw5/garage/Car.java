package com.kosobutskaya.hw5.garage;

public class Car {


    private Engine engine;
    private GasTank gasTank;
    private Lock lock;
    private Wheel[] wheels;
    private Alarm alarm;
    private String name;

    public void drive(String place) {
//        System.out.println("Прибыли в " + place);
        if (gasTank.getGas() == null) {
            System.out.println("заправь меня");
        }
    }

    public void fillUp(Gas gas) {
        gasTank.setGas(gas);
    }

    public void close(Key key) {
        lock.close(key);
    }

    public void open(Key key) {
        lock.open(key);
        if (lock.open(key)) {
            System.out.println("Car is open");
        } else {
            System.out.println("Car isn't open");

        }
    }

    public void startTheCar(){

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public GasTank getGasTank() {
        return gasTank;
    }

    public void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
