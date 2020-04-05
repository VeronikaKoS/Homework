package com.kosobutskaya.hw5.garage;

public class Man {
    private Car[] cars;
    private DriverLicense driverLicense;
    private Key[] keys;
    private String name;

    public void buy(Car car) {

        if (cars == null) {
            cars = new Car[1];   // создали массив car на 1 элемент и присвоили его полю cars
            cars[0] = car;       // поместили car по нулевому индексу в массив cars
        } else {                 // если cars >1  т.е. хранит массив на 2 эл-та
            Car[] temp = new Car[cars.length + 1]; // создали новый массив temp типа Car[] на 1 эл-т больше чем массив cars
            for (int i = 0; i < cars.length; i++) { // копируем машины из cars в temp
                temp[i] = cars[i]; // присваиваем эл-ту i массива temp значение cars по инексу i
            }
            temp[cars.length] = car;  // присвоить аргумент car последнему(увеличенному) эл-ту массива temp
            cars = temp;
        }
    }

    public void drive(Car car, String place) {
        car.drive(place);
        System.out.println(name + " прибыла в " + place + " на " + car);
    }

    public void catchMan() {

    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Key[] getKeys() {
        return keys;
    }

    public void setKeys(Key[] keys) {
        this.keys = keys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
