package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger burger = new Hamburger("Basic", "Plain", "Beef",4.01);
        double price = burger.itemizeHamburger();
        burger.addHamburgerAddition1("Tomato" , 0.51);
        burger.addHamburgerAddition2("Cheese" , 0.92);
        burger.addHamburgerAddition3("Bacon" , 1.53);

        System.out.println("Total Hamburger price is " + burger.itemizeHamburger());

        Healthy healthyBurger = new Healthy("Bacon", 4.56);
        healthyBurger.addHamburgerAddition1("Egg", 2.01);
        healthyBurger.addHealthAddition1("Beans", 2.54);

        System.out.println("Total Healthy burger price is " + healthyBurger.itemizeHamburger());

        Deluxe db = new Deluxe();
        db.itemizeHamburger();
        db.addHamburgerAddition3("should not happen " , 3.45);
        db.itemizeHamburger();

    }

}
