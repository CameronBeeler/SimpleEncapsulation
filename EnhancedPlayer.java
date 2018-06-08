package com.cambeeler;

public class EnhancedPlayer {
    private String name;
    private String weapon;
    private int health = 100;

    public EnhancedPlayer(String name, String weapon, int health) {

        this.name = name;
        this.weapon = weapon;

        if(health > 0 && health <= 100) {
            this.health = health;
        } else if (health > 100) {
            System.out.println("Initially assigned too much health");
        }else if (health <= 0){System.out.println("The player " + name + ", has expired");}
    }
    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("The player is out");
        }
    }

    public int getHealth(){
        return this.health;
    };
}
