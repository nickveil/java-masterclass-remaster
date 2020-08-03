package com.company;

public class Healthy extends Hamburger {
    private String isKale;
    private String isLightMayo;

    public Healthy(String bun, String meat, boolean isOnion, String isKale, String isLightMayo) {
        super(bun, meat, false, false, isOnion, false);
        this.isKale = isKale;
        this.isLightMayo = isLightMayo;
    }

    public String getIsKale() {
        return isKale;
    }

    public String getIsLightMayo() {
        return isLightMayo;
    }
}
