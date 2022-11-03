package com.vismaya.accessmodifier;

public class Public {
    public static void main(String[] args) {
        Access obj = new Access();
        //this is a package example
        obj.publicModi = "Can access in class, package, subclass, subclass(diff pkg), world/from anywhere";
    }
}
