package com.vismaya.interfaces;

public class Car implements Engine, Brake,Media{
    //Car one = new Car();
    @Override
    public void brakeHard() {
        System.out.println("Hard Brake");
    }

    @Override
    public void brakeSoft() {
        System.out.println("Soft Brake");
    }

    @Override
    public void start() {
        System.out.println("Starts normally with a key turn");
    }

    @Override
    public void stop() {
        System.out.println("Stops normally with a key turn");
    }

    @Override
    public void engine() {
        System.out.println("Engine is basic of model ABC" + Car.NUMBER);
    }

    @Override
    public void pause() {
        System.out.println("Pause the music by pressing this: || ");
    }
}
