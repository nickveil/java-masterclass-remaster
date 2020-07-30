package com.company;

public class Pool {
    private String game;

    public Pool(String game) {
        this.game = game;
    }

    public void beginGame(String game){
        System.out.println("We're playing " + game);
    }

    public String getGame() {
        return game;
    }
}
