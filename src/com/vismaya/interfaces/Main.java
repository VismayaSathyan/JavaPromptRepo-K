package com.vismaya.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.brakeHard();
//        car.brakeSoft();
//        car.engine();
//        car.pause();
//        car.stop();

        NewCar car = new NewCar();
        NewCar carOne = new NewCar(new PowerEngine());
        carOne.start();
        carOne.upgradeEngine();
        carOne.start();
        carOne.stop();
        carOne.reset();
        carOne.stop();
        car.startMusic();


//        car.electricEngine();
//        System.out.println("");
//        car.powerEngine();
//        System.out.println("");
//        car.mediaPlayer();


//        NewCar cardemo = new NewCar();
//        NewCar cardemo2 = new NewCar(new PowerEngine());
//        carOne.start();
//        carOne.stop();
//        car.startMusic();
    }
}
