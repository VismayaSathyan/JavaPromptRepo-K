package com.vismaya.videoTwo;

public class AreaSeries {
    public static void main(String[] args) {
        System.out.println("Circle: " +circle(3));
        System.out.println("Triangle: "+ triangle(2, 5));
        System.out.println("iso: "+ isosceles(5, 10));
        System.out.println("Rhombus: "+rhombus(3,6));
        System.out.println("Parallelogram: "+parallelogram(5, 3));
        System.out.println("EquilateralTriangle: "+equilateralTriangle(4));
        System.out.println("Rectangle: "+rectangle(4, 3));



    }
    public static double circle(float radius){
        return Math.PI * radius *radius;
    }
    public static double triangle(float breadth, float height){
        return 0.5 * breadth * height;

    }
    public static float rectangle(float length, float breadth){
        return length * breadth;

    }
    public static double isosceles(float aSides, float height){
        //using all 3 sides A = ½[√(a2 − b2 ⁄4) × b]
        //base = base of the isosceles triangle
        //eqSides = length of the two equal sides
        //double area = 0.5 * (Math.pow((eqSides*eqSides - base*base/4) * base, 1/2) );
        return 0.5 * aSides * height;
    }
    public static double parallelogram(float base, float height){
        return  base * height;
    }
    public static double rhombus(float diagonal1, float diagonal2){
        //When the diagonals are given
        return  0.5 * diagonal1 * diagonal2;
    }
    public static double equilateralTriangle(int side){
        return  Math.pow(3, 0.5)/4*side*side;
    }
}
