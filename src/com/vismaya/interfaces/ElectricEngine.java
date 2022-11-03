package com.vismaya.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts with Ele Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops with Ele Engine");
    }

    @Override
    public void engine() {
        System.out.println("Engine Model: ELE" + Engine.NUMBER);
    }
}
