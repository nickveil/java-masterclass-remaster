package com.company;

public class Main {

    public static void main(String[] args) {
	    Bar bar = new Bar("Scotch", true);
	    TV tv = new TV("YouTube TV", "Chair");
	    Pool pool = new Pool("8-ball");

	    Basement basement = new Basement(bar, tv, pool);

	    basement.getTV();

		basement.haveADrink();

    }
}
