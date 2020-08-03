package com.company;

public class Hamburger {
    private String bun;
    private String meat;
    private boolean isBacon;
    private boolean isCheese;
    private boolean isOnion;
    private boolean isMayo;


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
}
