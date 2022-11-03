package com.vismaya.interfaces;

public class NewCar {
    private Engine engine;
    private Media player;

    public NewCar(){
        player = new CDplayer();
        engine = new PowerEngine();
    }

    public NewCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

//    public void powerEngine(){
//        engine = new PowerEngine();
//        engine.start();
//        engine.stop();
//        engine.engine();
//    }
//
//    public void electricEngine(){
//        engine = new ElectricEngine();
//        engine.engine();
//        engine.start();
//        engine.stop();
//    }
//
//    public void mediaPlayer(){
//        player = new CDplayer();
//        player.start();
//        player.pause();
//        player.stop();
//    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

    public void reset(){
        this.engine = new PowerEngine();
    }

}
