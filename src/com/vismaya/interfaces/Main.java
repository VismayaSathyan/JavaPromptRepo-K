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
        car.start();
        car.upgradeEngine();
        car.start();
        car.stop();
        car.reset();
        car.stop();
        car.startMusic();
//        car.electricEngine();
//        System.out.println("");
//        car.powerEngine();
//        System.out.println("");
//        car.mediaPlayer();


    }
}
