package com.vismaya.oopsPrinciples;

public class InheritanceMain {
    public static void main(String[] args) {
        SingleChild student = new SingleChild();
        MultilevelDerived student2 = new MultilevelDerived();
        student2.age = 10;
        student2.prize = 3;
        student2.protectedAccessModi = "Flowers";
        SingleP obj = new SingleP();
        System.out.print("  : Without overriden toString method from default object class");
        System.out.println(obj);
        SingleChild obj1 = new SingleChild();
        System.out.println(obj1);

        System.out.println(student2.protectedAccessModi);
        System.out.println(student2.age);
        System.out.println(student2.prize);
        //System.out.println(student);
        //System.out.println(student.age + " " + student.school + " " + student.section+ " " + student.grade+ " " + student.presentation);
//        MultilevelDerived student1 = new MultilevelDerived(9,1,20,"DAV", "A", 3, "Animals", 1);
//        System.out.println(student1.prize);
    }
}
