package com.cambeeler;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name = "Cam";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage=10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//
//        damage = 9;
//        player.loseHealth(damage);
//        if(player.healthRemaining() >= 0){
//            System.out.println("Remaining Health = " + player.healthRemaining());
//        } else System.out.println("Player is dead");

EnhancedPlayer ePlayer = new EnhancedPlayer("Cam", "Sword", 75);
System.out.println("Initial health is " + ePlayer.getHealth());


    }
}
