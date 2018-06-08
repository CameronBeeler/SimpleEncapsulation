package com.cambeeler;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("The player is out");
        }
    }
    public int healthRemaining(){
        return this.health;
    }

}
