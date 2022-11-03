package com.vismaya.abstractDemo;

public class Son extends Parent{
    @Override
    void career() {
        System.out.println("Son: ");
        System.out.println("I want to be a Pilot");
    }

    @Override
    void partner() {
        System.out.println("My Partner is Samaira");
    }
}
