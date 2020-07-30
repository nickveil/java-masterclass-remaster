package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(5, 15, false);

//	    printer.addToner(23);
        System.out.println(printer.getTonerLevel());
        printer.printPage();
        System.out.println(printer.getTonerLevel());
    }
}
