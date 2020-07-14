package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(22,23,24));
        System.out.println(isTeen(-1));
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static boolean isTeen (int age1){
        return age1 >= 13 && age1 <=19;
    }
}
