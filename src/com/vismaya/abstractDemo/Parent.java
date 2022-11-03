package com.vismaya.abstractDemo;

public abstract class Parent {
    abstract void career();
    abstract void partner();

    static void method(){
        System.out.println("I am a Static method amd i do not depend on objects, So I can be created in an abstract class!");
    }

    void normal(){
        System.out.println("I am a normal method");
    }

    final void finalMethod(){
        System.out.println("I am a final method");
    }

    //The abstract class can have abstract methods, normal methods, final and static methods
    //cannot have abstract static methods, abstract constructors or final abstract class(since a final class cannot be inherited)
    //it can have data members with any type of access modifiers and constructors
}
