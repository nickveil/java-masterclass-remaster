package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pages, boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        this.pages = pages;
        this.isDuplex = isDuplex;
    }

    public void addToner(int toner){
        if(toner + tonerLevel > 100){
            tonerLevel = 100;
        }else {
            this.tonerLevel += toner;
        }
    }

    public void useToner(){
        this.tonerLevel -=1;
    }

    public void printPage(){
        boolean tonerEmpty = false;
        int pageRemaining = pages;
        System.out.println("Printer.printPage() called");

        for (int i = 1; i < pages + 1; i++){
            System.out.println("Printing page " + i);
            useToner();
            pageRemaining-=1;
            System.out.println("Toner level = " + getTonerLevel());

            if(this.tonerLevel <= 0){
                System.out.println("Toner empty, please add toner.");
                this.tonerLevel = 0;
                tonerEmpty = true;
                break;
            }else if (this.tonerLevel < 20){
                System.out.println("Toner getting low");

            }
        }
        if(tonerEmpty && (pageRemaining > 0 )){
            System.out.println("Printing could not complete because toner is empty." + "There are "+ pageRemaining + " pages left to print");
        }else {
            System.out.println("Printing complete");
        }
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
