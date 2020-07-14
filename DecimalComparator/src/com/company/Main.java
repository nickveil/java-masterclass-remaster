package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstNum, double secNumb){

        if((int) (firstNum*1000) == (int) (secNumb *1000) ){
            return true;
        }

        return false;
    }
}
