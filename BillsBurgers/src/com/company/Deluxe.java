package com.company;

public class Deluxe extends Hamburger {
    public Deluxe() {
        super("Deluxe", "Plain", "Beef and Bacon", 4.57);
        super.addHamburgerAddition1("Chips", 2.54);
        super.addHamburgerAddition2("Cola", 1.23);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");    }
}
