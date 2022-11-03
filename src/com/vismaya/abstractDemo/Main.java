package com.vismaya.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career();
        son.partner();
        son.normal();
        System.out.println("");

        Daughter daughter = new Daughter();
        daughter.career();
        daughter.partner();
        daughter.normal();
        daughter.finalMethod();
        System.out.println("");

        Parent.method();
//        Parent mom = new Parent(); //cannot create an object of abstract class without overriding abstract methods!
//        Parent dad = new Parent() {
//            @Override
//            void career() {
//                System.out.println("I am dad");
//            }
//
//            @Override
//            void partner() {
//                System.out.println("I love my wife");
//            }
//        };
//        dad.career();
//        dad.partner();
//        dad.normal();
    }
}
