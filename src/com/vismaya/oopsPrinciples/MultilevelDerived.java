package com.vismaya.oopsPrinciples;

import com.vismaya.accessmodifier.Access;

public class MultilevelDerived extends SingleChild {
    int prize;

//    public MultilevelDerived(int age, int height, int weight, String school, String section, int grade, String presentation, int prize) {
//        super(age, height, weight, school, section, grade, presentation);
//        this.prize = prize;
//    }

}

class subclass extends Access {
    void method1 (){
        subclass obj1 = new subclass();
        obj1.protectedModi = "I can access protected";
    }
}

class subSubClass extends subclass{
    void method2(){
        subclass obj2 = new subclass();
//        obj2.protectedModi= "Even tho I am a subclass of a base class i cannot access " +
//                "the protected as I become the base class for subSubClass";
    }
}
