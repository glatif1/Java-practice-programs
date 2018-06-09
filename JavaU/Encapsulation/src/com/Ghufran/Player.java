package com.Ghufran;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health<= 0){
            System.out.println("Player Knocked out!");
            //reduce number of remaining lives for player
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
