package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger burger = new Hamburger("plain","turkey",true,true,true,true);
        System.out.println(burger.getBun());
        System.out.println(burger.isBacon()+" " + burger.isBacon());
    }

}
