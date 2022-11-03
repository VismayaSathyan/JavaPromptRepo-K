package com.vismaya.accessmodifier;

import com.vismaya.oopsPrinciples.SingleChild;

public class PublicAndProtectedSubclass extends SingleChild{
    public static void main(String[] args) {
        SingleChild obj = new SingleChild();
        obj.publicAccessModi = "Public: I can access it via Parent object in a diff package";
        PublicAndProtectedSubclass obj1 = new PublicAndProtectedSubclass();
        obj1.publicAccessModi = "Public: I can access it via subclass/child object in a diff package";
        obj1.protectedAccessModi = "Protected I can access it via subclass/child object in a diff package";
        //obj.protectedAccessModi = "I cannot access protected via parent class obj of sa" +
               // "me package in a diff package only subclass of diff package can"; Hence throws an error.

        //only subclass object outside the package can access
        // the protected data member or method
        // but not the parent class obj itself
        // i.e when an object of the parent class is created in another subclass outside the package
        // it cannot access the protected but only the obj of subclass outside the package can.

        //can't access anyother modifiers in outside packages except public and protected.
    }
}
