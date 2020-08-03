package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger burger = new Hamburger("plain","turkey",true,false,true,true);
        burger.getTotalPrice();

        System.out.println("************************************");

        Deluxe deluxe = new Deluxe("Salt and Vinegar", "cola");
        deluxe.getTotalPrice();

    }

}
