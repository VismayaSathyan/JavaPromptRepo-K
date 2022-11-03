package com.vismaya.abstractDemo;

public class Daughter extends Parent{
    @Override
    void career() {
        System.out.println("Daughter: ");
        System.out.println("I want to be a Software developer");
    }

    @Override
    void partner() {
        System.out.println("My Partner is Sameer");
    }
}
