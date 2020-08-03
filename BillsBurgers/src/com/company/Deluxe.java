package com.company;

public class Deluxe extends Hamburger {
    private String chips;
    private String drink;

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    public Deluxe(String chips, String drink) {
        super("Plain", "Beef", false, false, false, false);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public void getTotalPrice() {

        System.out.println("Chips: " + this.chips + " = " +thi);
        super.getTotalPrice();
    }
}
