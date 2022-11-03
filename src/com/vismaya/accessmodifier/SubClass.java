package com.vismaya.accessmodifier;

public class SubClass extends Access{

    public static void main(String[] args) {

        SubClass obj = new SubClass();
        //subclass in same package
        obj.defaultModi = "Can access default";
        obj.protectedModi = "Can access protected";
        obj.publicModi= "Can Access Public";

        //cannot access Private.

        Access obj1 = new Access();
        //Base class in same package
        obj1.defaultModi = "Can access default";
        obj1.protectedModi = "Can access protected";
        obj1.publicModi= "Can Access Public";

        //Cannot access Private.
    }
}
