package com.company;

public class Bar {
    private String drink;
    private boolean isIce;

    public Bar(String drink, boolean isIce) {
        this.drink = drink;
        this.isIce = isIce;
    }

    public String getDrink() {
        return drink;
    }

    public boolean isIce() {
        return isIce;
    }

    public void whatWillYouHave(String drink, boolean isIce){
        String preference="";
        if(isIce){
            preference = "with";
        } else {
            preference = "without";
        }

        System.out.printf("I'll have a "+ drink + " " + preference + " ice.");
    }
}
