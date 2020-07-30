package com.company;

public class Basement {
    private Bar bar;
    private TV tv;
    private Pool pool;

    public Basement(Bar bar, TV tv, Pool pool) {
        this.bar = bar;
        this.tv = tv;
        this.pool = pool;
    }

    public void haveADrink(){
        System.out.println("Making a drink.");
        bar.whatWillYouHave(bar.getDrink(), bar.isIce());
    }

    public void getTV(){
        System.out.println("Turning on the tv.");
        tv.whatToWatch();
    }

    public Pool getPool() {
        return pool;
    }
}
