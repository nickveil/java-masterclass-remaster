package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(-3,-4));
    }
    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        return radius * radius * Math.PI;
    }
    public static double area(double side1, double side2){
        if (side1<0 || side2 <0 ){
            return -1;
        }
        return side1 * side2;
    }
}
