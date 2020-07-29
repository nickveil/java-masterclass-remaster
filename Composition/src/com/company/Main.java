package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell", "240", dimensions);

        Monitor monitor = new Monitor("27 inch Beast", "Acer",27, new Resolution(2540, 1440));

        MotherBoard motherBoard = new MotherBoard("BG-200","Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase, monitor, motherBoard);
        thePC.powerUp();
    }
}
