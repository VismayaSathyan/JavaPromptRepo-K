package com.vismaya.oopsPrinciples;

public class SingleChild extends SingleP {
    protected String protectedAccessModi;
    String defaultAccessModi;
    public String publicAccessModi;
    private String privateAccessModi;
    //private int num;
    @Override
    public String toString() {
        //System.out.println("Hurray");
        return "with Overridden method when you print an object you won't get a hashcode";
    }

    //Accessing a private data member/ field.
//    public static void main(String[] args) {
//        SingleChild obj = new SingleChild();
//        obj.num = 8;
//        System.out.println("Private num is: " + obj.num);
//    }
//    public SingleChild(int age, int height, int weight, String school, String section, int grade, String presentation) {
//        super(age, height, weight, school, section, grade);
//        this.presentation = presentation;
//    }

}
