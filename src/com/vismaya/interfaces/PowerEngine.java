package com.vismaya.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starts with power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops with Power Engine");
    }

    @Override
    public void engine() {
        System.out.println("Engine Model: ABC" + Engine.NUMBER);
    }
}
