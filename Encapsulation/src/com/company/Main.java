package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Nick";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Nick", 2000, "sword");
        System.out.println("Initial health = " + player1.getHealth());
    }
}
