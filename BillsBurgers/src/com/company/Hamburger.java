package com.company;

public class Hamburger {
    private String bun;
    private String meat;
    private boolean isBacon;
    private boolean isCheese;
    private boolean isOnion;
    private boolean isMayo;

    public double getBunPrice(){
        if (this.bun.toLowerCase() !="plain"){
            return 1.00;
        } else {
            return 0.00;
        }

    }

    public double getMeatPrice(){
        if (this.bun.toLowerCase() !="beef"){
            return 3.00;
        } else {
            return 2.00;
        }
    }

    public double getAdditionPrice(){
        double additionPrice = 0;
        if (this.isBacon){
            additionPrice += 1.00;
        }
        if(this.isCheese){
            additionPrice += .50;
        }
        if(this.isMayo){
            additionPrice += .10;
        }
        if(this.isOnion){
            additionPrice += .40;
        }
        return additionPrice;
    }

    public void getTotalPrice (){
        System.out.println("Bun: " + this.bun + " = $" + String.format("%.2f", getBunPrice()));
        System.out.println("Meat: " + this.meat + " = $" + String.format("%.2f",getMeatPrice()));
        System.out.println("Additions" +  " = $" + String.format("%.2f",getAdditionPrice()));
        System.out.println("Total cost" + "= $" + String.format("%.2f",(getBunPrice()+getMeatPrice()+getAdditionPrice())));
    }
    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isBacon() {
        return isBacon;
    }

    public boolean isCheese() {
        return isCheese;
    }

    public boolean isOnion() {
        return isOnion;
    }

    public boolean isMayo() {
        return isMayo;
    }

    public Hamburger(String bun, String meat, boolean isBacon, boolean isCheese, boolean isOnion, boolean isMayo) {
        this.bun = bun;
        this.meat = meat;
        this.isBacon = isBacon;
        this.isCheese = isCheese;
        this.isOnion = isOnion;
        this.isMayo = isMayo;


    }

    private void setBacon(boolean bacon) {
        isBacon = bacon;
    }

    private void setCheese(boolean cheese) {
        isCheese = cheese;
    }

    private void setOnion(boolean onion) {
        isOnion = onion;
    }

    private void setMayo(boolean mayo) {
        isMayo = mayo;
    }
}
