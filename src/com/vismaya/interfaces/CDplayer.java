package com.vismaya.interfaces;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("Starts with a bash");
    }

    @Override
    public void stop() {
        System.out.println("Stops in slow motion");
    }

    @Override
    public void pause() {
        System.out.println("Pauses immediately");
    }
}
